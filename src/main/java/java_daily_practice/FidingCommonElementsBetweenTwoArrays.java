package java_daily_practice;

import java.util.Arrays;
import java.util.HashSet;

public class FidingCommonElementsBetweenTwoArrays {
	
	public static void main(String ar[])
	{
		String str1[] = {"a","b","c"};
		String str2[] = {"a","d","e"};
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0;i<str1.length;i++)
		{
			for(int j=0;j<str2.length;j++)
			{
				if(str1[i].equals(str2[j]))
				{
					set.add(str1[i]);
				}
			}
		}
		
		System.out.println("Common Elements Between Arrays Are "+set);
		
		Integer int1[] = {1,2,3,4};
		Integer int2[] = {2,3,5,6};
		
		HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(int1));
		HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(int2));
		
		set1.retainAll(set2);
		
		System.out.println("Common Elements Between Arrays Are "+set1);
		
	}

}
