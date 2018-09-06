package java_excercises;

public class SeparatePositiveNegativeNumberAndSumUp {
	
	public static void main(String ar[])
	{
		int []array = {1,-2,3,-3,3};
		int positive =0,negative=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>0)
			{
			positive = positive+array[i];
			}
			else
			{
				negative = negative+array[i];
			}
		}
		
		System.out.println("Sumation of positive numbers "+positive);
		System.out.println("Sumation of negative numbers "+negative);
	}

}
