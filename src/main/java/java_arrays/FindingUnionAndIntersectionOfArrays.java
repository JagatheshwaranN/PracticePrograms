package java_arrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindingUnionAndIntersectionOfArrays {

	public static void union(int[]... inputArrays) {
		HashSet<Integer> union = new HashSet<Integer>();

		System.out.println("List of input arrays");
		for (int[] array : inputArrays) {

			System.out.println(Arrays.toString(array));
			for (int i : array) {
				union.add(i);
			}
		}

		System.out.println("Union of all arrays " + union);
	}

	public static void intersection(Integer[]... inputArrays) {

		System.out.println("List of input arrays");
		for (Integer[] array : inputArrays) {

			System.out.println(Arrays.toString(array));
		}
		HashSet<Integer> intersection = new HashSet<>(Arrays.asList(inputArrays[0]));

		for (int i = 1; i < inputArrays.length; i++) {
			HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArrays[i]));
			intersection.retainAll(set);

		}

		System.out.println("Intersection of all arrays " + intersection);
	}

	public static void main(String ar[]) {

		int[] array1 = { 1, 3, 4, 6 };
		int[] array2 = { 1, 3, 7, 8 };
		union(array1, array2);

		Integer[] array3 = { 1, 3, 4, 6 };
		Integer[] array4 = { 1, 3, 7, 8 };
		intersection(array3, array4);

	}
}
