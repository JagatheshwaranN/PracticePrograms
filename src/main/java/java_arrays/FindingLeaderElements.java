package java_arrays;

import java.util.Arrays;

public class FindingLeaderElements {

	public static void main(String ar[]) {
		FindingLeaderElements.getLeaderElement(new int[] { 16, 17, 4, 3, 5, 2 });
	}

	public static void getLeaderElement(int[] array) {
		System.out.println("The leader elements(The right side elements should be greater) in " + Arrays.toString(array)
				+ " are :");
		int arrayLen = array.length;
		int max = array[arrayLen - 1];
		System.out.print(max + " ");
		for (int i = arrayLen - 2; i >= 0; i--) {
			if (array[i] > max) {
				max = array[i];
				System.out.print(max + " ");
			}

		}
	}
}
