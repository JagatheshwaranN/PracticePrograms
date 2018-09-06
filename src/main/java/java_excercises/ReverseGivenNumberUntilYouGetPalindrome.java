package java_excercises;

public class ReverseGivenNumberUntilYouGetPalindrome {

	static int reverseNumber(int number) {
		int reverse = 0;
		int rem = 0;

		while (number != 0) {
			rem = number % 10;
			reverse = (reverse * 10) + rem;
			number = number / 10;
		}

		return reverse;
	}

	static boolean checkPalindrome(int number) {
		int reverse = reverseNumber(number);
		if (number == reverse) {
			return true;
		} else {
			return false;
		}
	}

	static void reverseAndAdd(int number) {
		if (checkPalindrome(number)) {
			System.out.println("Given number is a Palindrome : " + number);
		} else {
			while (!checkPalindrome(number)) {
				

				int reverse = reverseNumber(number);
System.out.println("After reverse");
				int sum = number + reverse;
				System.out.println(number + "+" + reverse + "=" + sum);
				number = sum;

			}
		}
	}
	
	public static void main(String ar[]) {
		reverseAndAdd(7325);
		reverseAndAdd(121);
	}

}
