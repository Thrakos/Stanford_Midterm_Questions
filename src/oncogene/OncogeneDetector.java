package oncogene;

import java.util.ArrayList;

public class OncogeneDetector {

	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String candidate) {
		
		int num = 0;
		double hp = 0;
		double cp = 0;
		
		for (int i = 0; i < healthySequences.size(); i++) {
			if (healthySequences.get(i).contains(candidate)) {
				num++;
			}
		}
		
		hp = (double)num/healthySequences.size();
		num = 0;
		
		for (int i = 0; i < cancerSequences.size(); i++) {
			if (cancerSequences.get(i).contains(candidate)) {
				num++;
			}
		}
		
		cp = (double)num/cancerSequences.size();
		
		if (cp>hp) {
			return true;
		} else {
			return false;
		}
	}

}
