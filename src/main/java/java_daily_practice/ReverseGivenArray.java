package java_daily_practice;

import java.util.Arrays;

public class ReverseGivenArray {

	public static void main(String ar[])
	{
		ReverseGivenArray.reverseArray(new int[] {1,2,3,4});
		
	}
	
	public static void reverseArray(int[] input)
	{
		System.out.println("Array Before Reverse : "+Arrays.toString(input));
		
		for(int i=0;i<input.length/2;i++)
		{
			int temp = input[i];
			input[i] = input[input.length-1-i];
			input[input.length-1-i] = temp;						
		}
		System.out.println("Array After Reverse : "+Arrays.toString(input));
	}
	
}
