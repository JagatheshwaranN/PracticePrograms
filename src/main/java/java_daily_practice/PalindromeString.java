package java_daily_practice;

public class PalindromeString {
	
	
	public static boolean ispalindrome(String input) {
		
		int len = input.length();
		int len1 = len/2;
		
		for(int i=0;i<len1;i++)
		{
			if(input.charAt(i)!=input.charAt(len-i-1))
			{
				return false;
			}
			
		}
		System.out.println("Palindrome : "+ input);
		return true;
		
	}
	public static void main(String ar[])
	{
		boolean palindrome = PalindromeString.ispalindrome("madam");
		System.out.println(palindrome);
	}

}
