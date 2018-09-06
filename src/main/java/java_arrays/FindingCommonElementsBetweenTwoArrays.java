package java_arrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindingCommonElementsBetweenTwoArrays {

	public static void main(String ar[])
	{
	HashSet<String> set = new HashSet<String>();
	String []str1 = {"ONE","TWO","THREE"};
	String []str2 = {"FOUR","TWO","FIVE"};
	
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
	
	System.out.println("Common elements in both Arrays > "+set);
	
	Integer l1[] = {1,2,3,4,5};
	Integer l2[] = {7,2,9,8,5};
	
	HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(l1));
	HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(l2));
	
	set1.retainAll(set2);
	
	System.out.println("Common elements in both Arrays > "+set1);
	}
	
	
}
