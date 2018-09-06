package java_excercises;

public class FindNumberLessThanGivenNumber {

	public static int lessThanGiven(int number, int digit) {
		char c = Integer.toString(digit).charAt(0);

		System.out.println("char c > " + c);

		for (int i = number; number > 0; --i) {
			System.out.println("Index of Char C > " + Integer.toString(i).indexOf(c));
			if (Integer.toString(i).indexOf(c) == -1) {

				return i;
			}
		}

		return -1;

	}

	public static void main(String ar[]) {
		// lessThanGiven(121, 2);
		System.out.println(lessThanGiven(125, 2));
	}

}
