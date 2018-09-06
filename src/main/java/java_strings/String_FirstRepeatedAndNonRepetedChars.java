package java_strings;

import java.util.HashMap;

public class String_FirstRepeatedAndNonRepetedChars {

	public static void firstRepeatedNonRepeatedChars(String input) {
		char[] strarr = input.toCharArray();
		HashMap<Character, Integer> chrcountmap = new HashMap<Character, Integer>();

		for (char c : strarr) {
			if (chrcountmap.containsKey(c)) {
				chrcountmap.put(c, chrcountmap.get(c) + 1);
			} else {
				chrcountmap.put(c, 1);
			}
		}

		for (char c : strarr) {
			if (chrcountmap.get(c) == 1) {
				System.out.println("First Non Repeated Character : " + c);
				break;
			}

		}

		for (char c : strarr) {
			if (chrcountmap.get(c) > 1) {
				System.out.println("First Repeated Character : " + c);
				break;
			}

		}

	}

	public static void main(String ae[]) {
		firstRepeatedNonRepeatedChars("javaconceptoftheday");

	}

}
