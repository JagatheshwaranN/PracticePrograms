package java_daily_practice;

public class RemoveWhiteSpaceInString {

	public static void main(String input[]) {
		String str = "i love  coding";

		StringBuilder str1 = new StringBuilder();

		char[] a = str.toCharArray();

		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			if ((a[i] != ' ') && (a[i] != '\t')) {
				str1.append(a[i]);
			}
		}

		System.out.println(str1.toString());
	}

}
