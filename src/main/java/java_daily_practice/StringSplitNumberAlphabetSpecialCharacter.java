package java_daily_practice;

public class StringSplitNumberAlphabetSpecialCharacter {
	
	public static void main(String ar[])
	{
	
		splitString("jo244hn3$%^#");
	}

	public static void splitString(String input)
	{
		StringBuffer alpha = new StringBuffer(),number = new StringBuffer(),specialChar = new StringBuffer();
		
		if(input.isEmpty())
		{
			System.out.println("Input is null");
		}
		
		else
		{
		for(int i=0;i<input.length();i++)
		{
			if(Character.isDigit(input.charAt(i)))
			{
				number.append(input.charAt(i));
			}
			else if(Character.isAlphabetic(input.charAt(i)))
			{
				alpha.append(input.charAt(i));
			}
			else
			{
				specialChar.append(input.charAt(i));
			}
		}
		System.out.println("Numbers : "+number);
		System.out.println("Alphabets : "+alpha);
		System.out.println("SpecialChars : "+specialChar);
		}
	}
}
