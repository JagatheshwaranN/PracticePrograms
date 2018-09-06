package java_strings;

public class Palindrome {

	public static boolean ispalin(String str) {
		if (str == null)
			return false;
		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();
		System.out.println(str1.reverse());
		System.out.println(str1.toString());
		return str1.toString().equals(str);
		
	}

	public static void main(String[] args) {

		boolean pal = Palindrome.ispalin("appa");
		System.out.println(pal);
	}

	



}
