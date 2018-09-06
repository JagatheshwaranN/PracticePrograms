package java_strings;

import java.util.Arrays;

public class String_Anagram {

	
	public static void isAnagram(String str1,String str2)
	{
		
		String copystr1 = str1.replaceAll("\\s", "");
		String copystr2 = str2.replaceAll("\\s", "");
		
		int str11 = copystr1.length();
		int str12 = copystr2.length();
		
		boolean status = true;
		
		if(str11!=str12)
		{
			
			System.out.println("Strings are not equal");
			status = false;
		}
		else
		{
			char []charstr1 = copystr1.toLowerCase().toCharArray();
			char []charstr2 = copystr2.toLowerCase().toCharArray();
			
			Arrays.sort(charstr1);
			Arrays.sort(charstr2);
			
			status = Arrays.equals(charstr1, charstr2);
		}
		
		if(status)
		{
			System.out.println("Str1 and Str2 are anagrams");
		}
		else
		{
			System.out.println("Str1 and Str2 are not anagrams");
		}
	}
	
	
	public static void main(String ar[])
	
	{
		String_Anagram.isAnagram("Dormitory", "DirtyRoom");
	}
}
