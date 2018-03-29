package animal_hipster;

public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {

		int length = testArray.length + 1;
		int[] array = new int[length];
		boolean added = false;

		for (int x = 0; x < length; x++) {
			if (x != i) {
				if (!added) {
					array[x] = testArray[x];
				} else {
					array[x] = testArray[x - 1];
				}
			} else {
				array[x] = j;
				added = true;
			}
		}

		return array;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {

		int length = orderedArray.length + 1;
		String[] array = new String[length];
		boolean added = false;

		for (int i = 0; i < length; i++) {
			if (!added && i < orderedArray.length) {
				System.out.println(i);
				if (orderedArray[i].compareTo(string) < 0) {
					array[i] = orderedArray[i];
				} else {
					array[i] = string;
					added = true;
				}
			} else {
				array[i] = orderedArray[i - 1];
			}
		}

		if (!added) {
			array[array.length - 1] = string;
		}

		return array;
	}

}
