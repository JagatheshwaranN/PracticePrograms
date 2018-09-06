package java_daily_practice;

public class CountSIngleCharOccurance {
	
	public static void main(String ar[])
	{
		String input = "javaj2ee";
		
		
		if(input!=null)
			
		{
			int charCount = input.length()-input.replace("j", "").length();
			System.out.println(charCount);
		}
		
	}

}
