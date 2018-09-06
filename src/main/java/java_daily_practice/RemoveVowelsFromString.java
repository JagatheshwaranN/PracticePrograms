package java_daily_practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowelsFromString {

	public static void removeVowelsFunction(String input)
	{
		input = input.replaceAll("[AEIOUaeiou]", "");
		System.out.println("StringWithoutVowels :"+input);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void removeVowelsWithoutFunction(String input)
	{
		char []arr = input.toCharArray();
		Set vowelset = new HashSet();
		vowelset.add('A');
		vowelset.add('E');
		vowelset.add('I');
		vowelset.add('O');
		vowelset.add('U');
		vowelset.add('a');
		vowelset.add('e');
		vowelset.add('i');
		vowelset.add('o');
		vowelset.add('u');
		
		StringBuffer str = new StringBuffer();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!vowelset.contains(arr[i]))
			{
				str.append(arr[i]);
			}
		}
		
		System.out.println("StringWithoutVowels :"+str);
		
		
	}
	
	public static void main(String ar[])
	{
		RemoveVowelsFromString.removeVowelsFunction("javaconcept");
		RemoveVowelsFromString.removeVowelsWithoutFunction("javaconcept");
	}
}
