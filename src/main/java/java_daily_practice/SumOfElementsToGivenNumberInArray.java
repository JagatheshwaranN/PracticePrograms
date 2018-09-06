package java_daily_practice;

public class SumOfElementsToGivenNumberInArray {

	public static void main(String ar[]) {
		SumOfElementsToGivenNumberInArray.getSumOfElements(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 10);
	}

	public static void getSumOfElements(int[] input, int num) {
		System.out.println("Sum of elements in an array to the given number " + num + " are");

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == num) {
					System.out.println(input[i] + "+" + input[j] + "=" + num);
				}
			}
		}

	}
}
