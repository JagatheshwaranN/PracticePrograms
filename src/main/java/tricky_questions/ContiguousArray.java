package tricky_questions;

import java.util.Arrays;
import java.util.HashSet;

public class ContiguousArray {

	public static void main(String ar[]) {
		int arr[] = { 5, 2, 3, 6, 4, 4, 6, 6 };
		int n = arr.length;

		if (contiguousArray(arr, n)) {
			System.out.println("Yes" + " Time Complexity : O(log n)");
		} else {
			System.out.println("No" + " Time Complexity : O(log n)");
		}

		if (contiguousArrays(arr, n)) {
			System.out.println("Yes" + " Time Complexity : O(n)");
		} else {
			System.out.println("No" + " Time Complexity : O(n)");
		}
	}

	public static boolean contiguousArray(int[] arr, int n) {
		Arrays.sort(arr);
		for (int i = 1; i < n; i++) {
			if (arr[i] - arr[i - 1] > 1) {
				return false;
			}
		}
		return true;
	}

	public static boolean contiguousArrays(int[] arr, int n) {

		HashSet<Integer> hashSet = new HashSet<Integer>();

		for (int i = 0; i < n; i++) {
			hashSet.add(arr[i]);
		}
		System.out.println(hashSet);

		int count = 1;
		int currentElement = arr[0] - 1;
		System.out.println(arr[0]);
		System.out.println(" arr[0] - 1>> " + currentElement);

		while (hashSet.contains(currentElement) == true) {
			count++;
			currentElement--;
		}
		currentElement = arr[0] + 1;
		System.out.println(arr[0]);
		System.out.println(" arr[0] + 1>> " + currentElement);

		while (hashSet.contains(currentElement) == true) {
			count++;
			currentElement++;
		}

		System.out.println(count);

		return (count == hashSet.size());

	}
}
