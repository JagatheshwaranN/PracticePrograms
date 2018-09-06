package java_strings;

public class String_EachWordReverse {

	public static void reverse_word(String input) {
		
		String[] words = input.split(" ");
		String reverseSentence = "";

		for (int i = 0; i <= words.length - 1; i++) {
			String word = words[i];
			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				                                                            
				reverseWord = reverseWord + word.charAt(j);
			}

			reverseSentence = reverseSentence + reverseWord + " ";
		}
		System.out.println("Reverse of each word : " + reverseSentence);
	}

	public static void main(String r[]) {
		
		reverse_word("i like java");  
	}
}
