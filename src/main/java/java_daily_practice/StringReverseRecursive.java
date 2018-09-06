package java_daily_practice;

public class StringReverseRecursive {

	public static void main(String ar[]) {
		String strrv = StringReverseRecursive.stringReverse("jimjam");
		System.out.println(strrv);
	}

	public static String stringReverse(String input) {
		if ((input == null) || (input.length() <= 1)) {
			return input;
		}
		return stringReverse(input.substring(1)) + input.charAt(0);

	}
}
