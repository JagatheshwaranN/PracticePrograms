package java_excercises;

public class SumOfDigits {

	public static int sumOfDigits(int input) {
		int number = input;
		int sum = 0;
		while (number != 0) {
			int digit = number % 10;
			sum = sum + digit;
			number = number / 10;

		}
		return sum;

	}

	static public void main(String ar[]) {
		sumOfDigits(123);
		System.out.println("Sum of digits > "+sumOfDigits(123));
	}
}
