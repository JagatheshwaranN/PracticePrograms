package java_daily_practice;

public class CountWordsInString {

	public static void main(String ar[]) {
		
		String input = "I Love Coding";

		int length = input.length();

		int count = 1;

		for (int i = 0; i < length; i++) {
			if ((input.charAt(i) == ' ') && (input.charAt(i + 1) != ' ')) {
				count++;
			}
		}

		/*
		 * String[] words = input.split(" "); 
		 * int count = words.length;
		 */

		System.out.println("Total words in String : " + count);
	}
}
