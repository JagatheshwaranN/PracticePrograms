package java_daily_practice;

import java.util.HashMap;

public class CountEachCharOccurance {

	public static void characterCounts(String input) {
		char[] chars = input.toCharArray();

		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();

		for (char c : chars) {
			if (countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c) + 1);

			} else {
				countMap.put(c, 1);
			}
		}

		System.out.println(countMap);
		System.out.println(countMap.toString());
	}

	public static void main(String ar[]) {
		characterCounts("AllisWell");

	}

}
