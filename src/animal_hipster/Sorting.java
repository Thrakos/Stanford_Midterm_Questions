package animal_hipster;

public class Sorting {

	public static void sort(String[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].compareTo(array[j]) > 0) {
					System.out.println(array[i]);
					System.out.println(array[j]);
					String placeholder = array[i];
					array[i] = array[j];
					array[j] = placeholder;
				}
			}
		}
	}
	
}
