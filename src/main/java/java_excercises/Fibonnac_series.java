package java_excercises;

import java.util.Scanner;

public class Fibonnac_series 
{

	public static void main(String[] args) 
	{
		
		int x1 = -1, x2 = 1, x3 = 0;
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number to find its fibonacci series");
		
		int n = s.nextInt();

			for (int i = 0 ; i < n; i++)
			{
				x3 = x1 + x2 ;
				
				System.out.println(x3);
				
				x1 = x2;
				x2 = x3;
			}
	}

}


