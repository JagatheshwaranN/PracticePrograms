package java_daily_practice;

import java.util.Arrays;

public class SeparateZeroFromNonZeroInArray {

	public static void moveZeroToEnd(int[] input) {
		int count = 0;

		for (int i = 0; i < input.length; i++) {

			if (input[i] != 0) {
				input[count] = input[i];
				count++;
			}

		}
		while (count < input.length) {
			input[count] = 0;
			count++;
		}

		System.out.println("Separation of Zero Elements From Non Zero Elements To the End is " + Arrays.toString(input));
	}

	public static void moveZeroToFront(int[] input) {

		int count = input.length - 1;
		for (int i = input.length - 1; i >= 0; i--) {
			if (input[i] != 0) {
				input[count] = input[i];
				count--;
			}
		}
		while (count >= 0) {
			input[count] = 0;
			count--;
		}

		System.out.println("Separation of Zero Elements From Non Zero Elements To the Front is " + Arrays.toString(input));
	}

	public static void main(String ar[]) {
		SeparateZeroFromNonZeroInArray.moveZeroToEnd(new int[] { 1, 0, 2, 3, 0, 4, 0, 5 });
		SeparateZeroFromNonZeroInArray.moveZeroToFront(new int[] { 1, 0, 2, 3, 0, 4, 0, 5 });
	}
}
