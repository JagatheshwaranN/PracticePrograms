package java_strings;

import java.util.HashMap;

public class CountEachCharacterOccurance {

	public static void countEachChar(String str) {
		if (str != null) {
			HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();

			char[] strtochar = str.toCharArray();

			for (char c : strtochar) {
				if (countMap.containsKey(c)) {
					countMap.put(c, countMap.get(c) + 1);
					System.out.println(countMap.get(c));
				} else {
					countMap.put(c, 1);
				}
			}

			System.out.println(countMap);
		}

	}

	public static void main(String[] args) {

		countEachChar("All Is Well");

	}

}

/*
 * import java.util.Scanner;
 * 
 * public class CountEachCharacterOccurance { public static void main(String
 * args[]) { int count=0; System.out.println("Enter the String:"); Scanner sc =
 * new Scanner(System.in); String s = sc.nextLine(); for(char i='a';i<='z';i++)
 * { for(int j=0;j<s.length()-1;j++) { if(s.charAt(j)==i){ count++; } }
 * if(count!=0){ System.out.println(i+"="+count); count=0; } } } }
 */
