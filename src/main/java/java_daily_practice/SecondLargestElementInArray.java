package java_daily_practice;

public class SecondLargestElementInArray {

	public static void main(String ar[]) {
		SecondLargestElementInArray.secondLarge(new int[] { 5, 7, 9, 12, 15 });
		System.out.println(
				"Second Largest Element " + SecondLargestElementInArray.secondLarge(new int[] { 5, 7, 9, 12, 15 }));
	}

	public static int secondLarge(int[] array) {
		int first = 0;
		int second = 0;

		if (array[0] > array[1]) {
			first = array[0];
			second = array[1];

		} else if (array[0] < array[1]) {
			first = array[1];
			second = array[0];
		}

		for (int i = 2; i < array.length; i++) {
			if (array[i] > first) {

				second = first;
				first = array[i];
			}

			else if (array[i] < first && array[i] > second) {
				second = array[i];
			}
		}
		return second;

	}
}
