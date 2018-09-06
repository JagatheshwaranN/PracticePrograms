package java_arrays;

public class SecondLargestElement {

	public static int secondLarge(int[] input) {
		int first = 0;
		int second = 0;

		if (input[0] > input[1]) {
			first = input[0];
			second = input[1];
		} else {
			first = input[1];
			second = input[0];

		}
		for (int i = 2; i < input.length; i++) {
			if (input[i] > first) {
				second = first;
				first = input[i];
			} else if (input[i] < first && input[i] > second) {
				second = input[i];
			}
		}
		return second;
	}

	public static void main(String ar[]) {
		secondLarge(new int[] { 10, 12, 7, 13, 15 });
		System.out.println(secondLarge(new int[] { 10, 12, 7, 13, 15 }));
	}
}
