package java_daily_practice;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateElementAndItsOccurance {

	public static void main(String ar[]) {
		duplicateOccurance("javaj2ee");

	}

	public static void duplicateOccurance(String input) {
		input = input.toLowerCase();
		char[] character = input.toCharArray();
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();

		for (char c : character) {
			if (countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c) + 1);
			} else {
				countMap.put(c, 1);
			}
		}
		Set<Character> keys = countMap.keySet();
		for (char c : keys) {
			if (countMap.get(c) > 1) {
				System.out.println("Duplicate Element :"+ c + " and its occurance :" + countMap.get(c));
			}
		}
	}
}
