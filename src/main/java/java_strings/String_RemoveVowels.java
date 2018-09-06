package java_strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class String_RemoveVowels {

	public static void removeVowelsWithFunction(String input) {

		String newInputString = input.replaceAll("[AEIOUaeiou]", "");

		System.out.println("The string without vowels found by function : " + newInputString);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void removeVowelsWithoutFunction(String input) {

		Set vowelset = new HashSet();
		vowelset.add('A');
		vowelset.add('E');
		vowelset.add('I');
		vowelset.add('O');
		vowelset.add('U');
		vowelset.add('a');
		vowelset.add('e');
		vowelset.add('i');
		vowelset.add('o');
		vowelset.add('u');

		StringBuffer str = new StringBuffer();
		char[] chars = input.toCharArray();
		for (char c : chars) {
			if (!vowelset.contains(c)) {
				str.append(c);
			}
		}

		System.out.println("The string without vowels found by without using function : " + str);

	}

	public static void main(String ar[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String input = sc.nextLine();

		removeVowelsWithFunction(input);
		removeVowelsWithoutFunction(input);

		sc.close();
	}
}
