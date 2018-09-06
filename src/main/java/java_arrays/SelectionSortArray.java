package java_arrays;

public class SelectionSortArray {

	public static void selectionSort(int input[]) {

		int temp, pos;
		

		for (int i = 0; i < input.length - 1; i++) {
			pos = i;

			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[pos]) {
					pos = j;
				}
			}

			temp = input[i];
			input[i] = input[pos];
			input[pos] = temp;

		}

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

	public static void main(String ar[]) {
		selectionSort(new int[] { 7, 3, 5 });
	}
}
