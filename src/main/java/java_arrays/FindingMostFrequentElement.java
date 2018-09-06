package java_arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindingMostFrequentElement {
	

	public static void getFrequentElement(int[] inputArray) {
		HashMap<Integer, Integer> hashCount = new HashMap<Integer, Integer>();

		for (int i : inputArray) {
			if (hashCount.containsKey(i)) {
				hashCount.put(i, hashCount.get(i) + 1);
			} else {
				hashCount.put(i, 1);
			}
		}

		int element = 0;
		int frequency = 1;

		Set<Entry<Integer, Integer>> entryset = hashCount.entrySet();
		for (Entry<Integer, Integer> entry : entryset) {
			if (entry.getValue() > frequency) {
				element = entry.getKey();
				frequency = entry.getValue();
			}
		}

		if (frequency > 1) {
			System.out.println("Input Array : " + Arrays.toString(inputArray));
			System.out.println("Most Frequent Element : " + element);
			System.out.println("Frequency of Occurance : " + frequency);
		} else {
			System.out.println("Input Array : " + Arrays.toString(inputArray));
			System.out.println("All Elements are Unique");
		}
	}

	public static void main(String ar[]) {
		getFrequentElement(new int[] { 1, 2, 3, 4, 3, 5, 6 });
		getFrequentElement(new int[] { 1, 2, 3, 4, 5, 6 });
	}

}
