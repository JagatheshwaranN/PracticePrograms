package java_daily_practice;

public class SelectionSorting {

	public static void main(String ar[]) {
		SelectionSorting.getSelectionSort(new int[] { 7, 3, 5 });
	}

	public static void getSelectionSort(int[] input) {
		int temp, position;

		for (int i = 0; i < input.length - 1; i++) {
			position = i;

			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[position]) {
					position = j;
				}
			}

			temp = input[i];
			input[i] = input[position];
			input[position] = temp;

		}

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
