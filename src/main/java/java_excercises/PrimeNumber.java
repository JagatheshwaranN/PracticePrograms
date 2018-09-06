package java_excercises;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String ar[]) {
		primeNumber();
		primeNumberRange();
		primeNumberInRange();
	}

	public static void primeNumberRange() {

		System.out.println("Enter the number to which prime number have to be generated");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int i = 0, number = 0;
		String prime = "";
		for (i = 1; i <= input; i++) {
			int count = 0;
			for (number = i; number >= 1; number--) {
				if (i % number == 0) {
					count++;
				}
			}
			if (count == 2) {
				prime = prime + i + " ";
			}
		}
		System.out.println("Prime number from 1 to " + input + " is ");
		System.out.println(prime);

	}
	
	public static void primeNumberInRange() {

		System.out.println("Enter the number up to which prime number have to genarate");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int flag = 0;
		for(int i=2;i<=input;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = 0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(i);
			}
		}
		
	}

	public static void primeNumber() {

		System.out.println("Enter the number to check it is prime or not");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int j = 0, count = 0;

		for (j = 2; j <= input / 2; j++) {
			if (input % j == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(input + " is prime number");
		} else {
			System.out.println(input + " is not prime number");
		}
	}

}
