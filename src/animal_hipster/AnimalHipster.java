package animal_hipster;

import java.util.ArrayList;
import java.util.HashMap;

public class AnimalHipster {

	public ArrayList<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network,
			HashMap<String, String> favoriteAnimals) {

		ArrayList<String> list = new ArrayList<String>();

		for (String s : network.keySet()) {
			
			boolean hipster = true;
			ArrayList<String> friendos = network.get(s);
			String favAnimal = favoriteAnimals.get(s);
			
			for (int i = 0; i < friendos.size(); i++) {
				String friendo = friendos.get(i);
				if (favAnimal == favoriteAnimals.get(friendo)) {
					hipster = false;
				}
			}
			if (hipster) {
				list.add(s);
			}
		}
		return list;
	}

}
