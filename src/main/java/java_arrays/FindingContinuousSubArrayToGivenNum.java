package java_arrays;

import java.util.Arrays;

public class FindingContinuousSubArrayToGivenNum {
	

	public static void findSubArray(int[] input, int num) {

		int start = 0;
		int sum = input[0];

		for (int i = 1; i < input.length; i++) {
			sum = sum + input[i];

			while (sum > num && start <= i - 1) {
				sum = sum - input[start];
				start++;

			}

			if (sum == num) {
				System.out.println(
						"Continuous sub array of " + Arrays.toString(input) + " whose sum equal to given num " + num);

				for (int j = start; j <= i; j++) {
					System.out.print(input[j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String ar[]) {
		findSubArray(new int[] { 11, 5, 10, 2, 3, 12 }, 20);
	}

}
