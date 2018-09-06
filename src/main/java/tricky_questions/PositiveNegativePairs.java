package tricky_questions;

import java.util.Collections;
import java.util.LinkedList;

public class PositiveNegativePairs {

	public static void main(String ar[]) {

		int[] arr = { 4, 8, 9, -4, 1, -1, -8, -9 };
		int n = arr.length;
		posNegPairs(arr, n);
	}

	public static void posNegPairs(int[] arr, int n) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs(arr[i]) == Math.abs(arr[j])) {
					list.add(arr[i]);
				}
			}
		}
		if (list.size() == 0) {
			return;
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(" " + -list.get(i) + " " + list.get(i));
		}
	}
}
