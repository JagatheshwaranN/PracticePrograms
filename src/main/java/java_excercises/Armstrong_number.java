package java_excercises;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		armstrongRange();
		armstrong();
	}

	public static void armstrong() {

		int sum = 0, mul = 0, temp = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number to check for Armstrong");

		int n = sc.nextInt();

		temp = n;

		while (n > 0) {
			mul = n % 10;
			System.out.println("mul : " + mul);
			sum = sum + mul * mul * mul;
			System.out.println("n before : " + n);
			n = n / 10;
			System.out.println("n : " + n);
		}

		if (sum == temp) {
			System.out.println(temp + " is Armstrong No.");
		} else {
			System.out.println(temp + " is not Armstrong No.");
		}

	}

	public static void armstrongRange() {

		System.out.println("Armstong number from 1 to 1000 are ");

		int sum = 0, rem = 0, num = 0;

		for (int i = 1; i <= 1000; i++) {

			num = i;
			while (num > 0) {
				rem = num % 10;
				sum = sum + (rem * rem * rem);
				num = num / 10;
			}

			if (sum == i) {
				System.out.print(i + " ");
			}
			sum = 0;
		}
		System.out.println();
	}

}
