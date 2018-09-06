package java_daily_practice;

public class MissingElementInGivenArray {
	
	public static void main(String ar[])
	{
		int  number = 5;
		int[] array = {1,3,4,5};
		int missingNumber = sumofNumber(number)-sumofElements(array);
		
		System.out.println("Missing Element in an array "+missingNumber);
	}

	public static int sumofNumber(int num)
	{
		int sum = (num*(num+1))/2;
		return sum;
		
	}
	
	public static int sumofElements(int[] arr)
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
		sum = sum+arr[i];
		}
		return sum;
		
	}
}
