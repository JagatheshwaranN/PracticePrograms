package java_excercises;

import java.util.Scanner;

public class Floyds_traingle 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number to find its floyds traingle");
		
		int n = s.nextInt();
		
		int i = 1, j= 1,num = 1;
		
		for(i = 1; i <= n ; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print(num);
				num++;
				
			}
			System.out.println();
		}
		
	}

}
