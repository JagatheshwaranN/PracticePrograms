package java_daily_practice;

import java.util.LinkedHashMap;

public class LongestNonRepeatedSubString {

	public static void longestsubstring(String input)
	{
		input = input.toLowerCase();
		char []c = input.toCharArray();
		int longestsubstringlength = 0;
		String longestsubstring = "";
		
		LinkedHashMap<Character,Integer> lnkmap = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<c.length;i++)
		{
			char ch = c[i];
			if(!lnkmap.containsKey(ch))
			{
				lnkmap.put(ch, i);
			}
			else
			{
				
				i= lnkmap.get(ch);
				System.out.println(i);
				System.out.println(lnkmap);
				lnkmap.clear();
			}
		}
		
		if(lnkmap.size()>longestsubstringlength)
		{
			longestsubstring = lnkmap.keySet().toString();
			longestsubstringlength = lnkmap.size();
		}
		
		System.out.println("longestsubstring "+longestsubstring);
		System.out.println("longestsubstringlength "+longestsubstringlength);
		
	}
	
	public static void main(String ar[])
	{
		LongestNonRepeatedSubString.longestsubstring("javaconceptoftheday");
	}
}
