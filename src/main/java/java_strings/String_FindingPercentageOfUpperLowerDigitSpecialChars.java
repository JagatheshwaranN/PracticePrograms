package java_strings;

import java.text.DecimalFormat;

public class String_FindingPercentageOfUpperLowerDigitSpecialChars {
	
	
	public static void percantageCharacter(String input)
	{
		
		int totalchars = input.length();
		
		int upperchars = 0;
		int lowerchars = 0;
		int digits = 0;
		int others = 0;
		
		for(int i = 0;i<totalchars;i++)
		{
			char ch = input.charAt(i);
			
			if(Character.isUpperCase(ch))
			{
				upperchars++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowerchars++;
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}
			else
			{
				others++;
			}
		}
		
		Double upperPercent = upperchars*100.0/totalchars;
		Double lowerPercent = lowerchars*100.0/totalchars;
		Double digitsPercent = digits*100.0/totalchars;
		Double specialcharsPercent = others*100.0/totalchars;
		
		DecimalFormat format = new DecimalFormat("##.##");
		
		System.out.println("Upper Case Letters Percentage : " + format.format(upperPercent)+"%");
		System.out.println("Lower Case Letters Percentage : " + format.format(lowerPercent)+"%");
		System.out.println("Digits Percentage : " + format.format(digitsPercent)+"%");
		System.out.println("Special Case Letters Percentage : " + format.format(specialcharsPercent)+"%");
	}

	
	public static void main(String ar[])
	{
		percantageCharacter("Tiger Runs @ The Speed Of 100 km/hour.");
	}
}
