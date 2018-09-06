package java_daily_practice;

public class WordReverseInSentence {
	
	public static void main(String ar[])
	{
		String input = "i love coding";
		String reverse = "";
		
		String[] a = input.split(" ");
		
		int len = a.length;
		
		for(int i=len-1;i>=0;i--)
		{
			reverse = reverse+(a[i]+" ");
		}
		
		System.out.println(reverse);
	}

}
