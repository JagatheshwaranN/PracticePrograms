package java_arrays;

import java.util.HashSet;

public class FindingDuplicatesInArray {
	
	public static void main(String ar[])
	{
		String []arr = {"abc","def","ghi","abc"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j])&& i!=j)
				{
					System.out.println("Duplicate element is :"+arr[j]);
				}
			}
		}
		
		
		HashSet<String> set = new HashSet<String>();
		
		for(String a : arr)
			
		{
			if(!set.add(a))
			{
				System.out.println("Duplicate element is :"+a);
			}
		}
		
	}

}
