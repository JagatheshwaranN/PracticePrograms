package java_arrays;

import java.util.Arrays;

public class SeparateZeroFromNonZero {

	public static void moveZeroToEnd(int input[]) {
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
		System.out.println("The NonZero Elements Separated and Zero Elements in End are :" + Arrays.toString(input));
	}

	public static void moveZeroToFront(int input[]) {
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
		System.out.println("The NonZero Elements Separated and Zero Elements in Front are :" + Arrays.toString(input));
	}

	public static void main(String ar[]) {
		moveZeroToEnd(new int[] { 2, 0, 5, 0, 8, 9 });
		moveZeroToFront(new int[] { 2, 0, 5, 0, 8, 9 });
	}
}
