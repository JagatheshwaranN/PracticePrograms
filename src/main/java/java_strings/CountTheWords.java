package java_strings;

public class CountTheWords {

	public static void main(String[] args) {

		String str = "I love to learn java";

		/*
		 * With Function
		 * 
		 * String []words = str.trim().split(" ");
		 * 
		 * int length = words.length;
		 * 
		 * System.out.println(length);
		 */

		int len = str.length();

		int count = 1;

		for (int i = 0; i < len - 1; i++) {
			System.out.println("charAt(1) "+str.charAt(1));
			System.out.println("charAt(2) "+str.charAt(2));
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}

}
