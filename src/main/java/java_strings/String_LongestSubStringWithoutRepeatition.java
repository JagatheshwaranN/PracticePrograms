package java_strings;

import java.util.LinkedHashMap;

public class String_LongestSubStringWithoutRepeatition {

	public static void longestSubString(String input) {

		char[] ch = input.toCharArray();

		String longestsubstr = " ";
		int longestsubstrlen = 0;

		LinkedHashMap<Character, Integer> lnkhasmap = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (!lnkhasmap.containsKey(c)) {
				lnkhasmap.put(c, i);
			} else {
				i = lnkhasmap.get(c);
				lnkhasmap.clear();
			}
		}
		if (lnkhasmap.size() > longestsubstrlen) {
			longestsubstr = lnkhasmap.keySet().toString();
			longestsubstrlen = lnkhasmap.size();
		}

		System.out.println("Longest sub string " + longestsubstr);
		System.out.println("Longest sub String length " + longestsubstrlen);
	}

	public static void main(String at[]) {
		longestSubString("javaconceptoftheday");
	}
}