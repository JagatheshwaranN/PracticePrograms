package java_daily_practice;

import java.util.HashMap;

public class PrintFirstRepeatedAndNonRepeatedLetterInString {
	
	
	public static void charRepeatedNonRepated(String input)
	{
		input = input.toLowerCase();
		char []arr = input.toCharArray();
		HashMap<Character,Integer> countMap = new HashMap<Character,Integer>();
		
		for(char a:arr)
		{
			if(countMap.containsKey(a))
			{
				countMap.put(a, countMap.get(a)+1);
			}
			else
			{
				countMap.put(a, 1);
			}
		}
		
		for(char a:arr)
		{
			if(countMap.get(a)==1)
			{
				System.out.println("First Non Repeated Character in String "+a);
				break;
			}
		}
		
		for(char a:arr)
		{
			if(countMap.get(a)>1)
			{
				System.out.println("First Repeated Character in String "+a);
				break;
			}
		}
		
		
	}
	
	public static void main(String ar[])
	{
		PrintFirstRepeatedAndNonRepeatedLetterInString.charRepeatedNonRepated("JavaConcept");
	}

}
