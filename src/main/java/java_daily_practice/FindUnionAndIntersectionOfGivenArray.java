package java_daily_practice;

import java.util.Arrays;
import java.util.HashSet;

public class FindUnionAndIntersectionOfGivenArray {
	
	public static void main(String ar[])
	{
		int[] array1 = {1,2,3,4};
		int[] array2 = {3,4,5,6};
		union(array1,array2);
		Integer[] array3 = {1,2,3,4};
		Integer[] array4 = {3,4,5,6};
		intersection(array3,array4);
	}

	public static void union(int[]... inputarrays)
	{
		HashSet<Integer> union = new HashSet<Integer>();
		
		System.out.println("List of Arrays given");
		for(int[] arr : inputarrays)
		{
			System.out.println(Arrays.toString(arr));
		
		for(int i : arr)
		{
			union.add(i);
		}
		}
		System.out.println("Union of elements in given arrays are : "+union);
	}
	
	public static void intersection(Integer[]... inputarrays)
	{
		System.out.println("List of Arrays given");
		for(Integer[] arr : inputarrays)
		{
			System.out.println(Arrays.toString(arr));
		}
	
	
	HashSet<Integer> intersect = new HashSet<Integer>(Arrays.asList(inputarrays[0]));
	for(int i=0;i<inputarrays.length;i++)
	{
	HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(inputarrays[i]));
	intersect.retainAll(set);
	}
	System.out.println("Intersection of all arrays " + intersect);
	}
}

