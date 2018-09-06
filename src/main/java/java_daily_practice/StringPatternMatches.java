package java_daily_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPatternMatches {
	
	public static void main(String ar[])
	{
		System.out.println(Pattern.matches("geeksforge*ks", "geeksforgeeks"));
		System.out.println(Pattern.matches("g*geeks*", "geeksfor"));
		patternMatch();
		splitText();
		
	}
 
	public static void patternMatch()
	{
		Pattern pattern = Pattern.compile("geeks",Pattern.CASE_INSENSITIVE);
		Matcher match = pattern.matcher("geeksforGeeks.org");
		
		while(match.find())
		{
			System.out.println("Pattern found from " +match.start()+" to "+ (match.end()-1));
		}	
		
	}
	
	public static void splitText()
	{
		String text = "geeks1for2geeks3";
		String delimiter = "\\d";
		Pattern pattern = Pattern.compile(delimiter,Pattern.CASE_INSENSITIVE);
		String result[] = pattern.split(text);
		for(String data : result)
		{
			System.out.println(data);
		}
	}
}
