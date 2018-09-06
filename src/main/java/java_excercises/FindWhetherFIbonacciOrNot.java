package java_excercises;

import java.util.Scanner;

public class FindWhetherFIbonacciOrNot {

	@SuppressWarnings("resource")
	public static void main(String ar[]) {
		int x = -1, y = 1, z = 0;

		System.out.println("Enter the number to check for Fibonacci or not");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		while (z < number) {
			z = x + y;
			x = y;
			y = z;
		}

		if (z == number) {
			System.out.println("The Given Number " + number + " is a fibonacci");
		} else {
			System.out.println("The Given Number " + number + " is a not fibonacci");
		}
	}

}
