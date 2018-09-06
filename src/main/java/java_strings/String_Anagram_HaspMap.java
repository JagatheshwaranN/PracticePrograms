package java_strings;

import java.util.HashMap;

public class String_Anagram_HaspMap {

	public static void isAnagram(String str1, String str2) {

		String copystr1 = str1.replaceAll("\\s", "").toLowerCase();
		String copystr2 = str2.replaceAll("\\s", "").toLowerCase();

		int str11 = copystr1.length();
		System.out.println(copystr1);
		System.out.println(str11);
		int str12 = copystr2.length();
		System.out.println(copystr2);
		System.out.println(str12);
		boolean status = true;

		if (str11 != str12) {

			System.out.println("Strings are not equal");
			status = false;
		} else {
			
			HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
			
			for (int i = 0; i < copystr1.length(); i++) {
				
				int countvalue = 0;

				char c = copystr1.charAt(i);

				if (hmap.containsKey(c)) {
					countvalue = hmap.get(c);
				} 
					hmap.put(c, ++countvalue);
				
				
				countvalue = 0;

				c = copystr2.charAt(i);

				if (hmap.containsKey(c)) {
					countvalue = hmap.get(c);
				}
					hmap.put(c, --countvalue);
				

			}
			for (int value : hmap.values()) {
				if (value != 0) {
					status = false;
				}
			}
		}

		if (status) {
			System.out.println(status);
			System.out.println("Str1 and Str2 are anagrams");
		} else {
			System.out.println("Str1 and Str2 are not anagrams");
		}
	}

	public static void main(String ar[])

	{
		//String_Anagram_HaspMap.isAnagram("Dormitory", "DirtyRoom");
		isAnagram("Mother In Law", "Hitler Woman");
	}
}
