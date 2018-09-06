package java_strings;

public class String_SwappingWithoutTemp {

	public static void main(String ar[]) {
		String s1 = "jagan";
		String s2 = "waran";

		System.out.println("s1 and s2 before Swapping : " + s1 + " " + s2);
		s1 = s1 + s2;

		s2 = s1.substring(0, s1.length() - s2.length());

		s1 = s1.substring(s2.length());

		System.out.println("s1 and s2 after Swapping : " + s1 + " " + s2);

	}

}
