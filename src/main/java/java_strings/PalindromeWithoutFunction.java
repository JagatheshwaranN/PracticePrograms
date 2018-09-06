package java_strings;

public class PalindromeWithoutFunction {

	public static boolean ispalin(String str) {
		if (str == null)
			return false;

		int len = str.length();
		System.out.println(len);
		System.out.println(len/2);

		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1))
				return false;
		}
		return true;

	}

	public static void main(String[] args) {

		boolean pal = PalindromeWithoutFunction.ispalin("madam");
		System.out.println("Palindrome : " + pal);
	}

}
