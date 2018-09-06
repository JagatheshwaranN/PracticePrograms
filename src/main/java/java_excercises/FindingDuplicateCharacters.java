package java_excercises;

import java.util.HashMap;
import java.util.Set;

public class FindingDuplicateCharacters {
	
	public static void duplicatechars(String str)
	{
		HashMap<Character,Integer> charcount = new HashMap<Character,Integer>();
		
		char []c = str.toCharArray();
		
		for(char ch : c)
		{
			if(charcount.containsKey(ch))
			{
				charcount.put(ch,charcount.get(ch)+1);
			}
			
			else
			{
				charcount.put(ch, 1);
			}
		}
				
		
		Set<Character> setchr = charcount.keySet();
		
		for(char chars : setchr)
		{
			if(charcount.get(chars)>1)
			{
				//System.out.println("character -"+ chars +" : Duplicate occurance - "+ (charcount.get(chars)-1));
				System.out.println("character -"+ chars +" : Duplicate occurance - "+ charcount.get(chars));
			}
		}
		
	}
	
	public static void main(String ar[])
	{
		
		FindingDuplicateCharacters.duplicatechars("Jaga likes Java");
	}

}
