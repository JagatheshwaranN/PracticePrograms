package java_arrays;

import java.util.Arrays;

public class ReverseOfArray {

	public static void reverseArray(int[] input) {

		System.out.println("Array before Reverse : " + Arrays.toString(input));
		for (int i = 0; i < input.length / 2; i++) {
			int temp = input[i];
			input[i] = input[input.length - 1 - i];
			input[input.length - 1 - i] = temp;
			System.out.println("Iteraton : " + i);
			System.out.println("temp : " + temp);
			System.out.println("input[i] : " + input[i]);
			System.out.println("input[input.length - 1 - i] : " + input[input.length - 1 - i]);

		}

		System.out.println("Array After Reverse : " + Arrays.toString(input));
	}

	public static void main(String ar[]) {
		reverseArray(new int[] { 1, 2, 3, 4, 5 });
	}
}
