package java_daily_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindingFrequentElementAndItsOccuranceInArray {
	
	public static void main(String ar[])
	{
		FindingFrequentElementAndItsOccuranceInArray.getFrequencyOfElement(new int[] {1,2,3,4,5,3,6});
		FindingFrequentElementAndItsOccuranceInArray.getFrequencyOfElement(new int[] {1,2,3,4,5,6});
		
	}

	public static void getFrequencyOfElement(int[] inputArray)
	{
		
		HashMap<Integer,Integer> frequencyMap = new HashMap<Integer,Integer>();
		
		for(int i : inputArray)
		{
			if(frequencyMap.containsKey(i))
			{
				frequencyMap.put(i, frequencyMap.get(i)+1);
			}
			else
			{
				frequencyMap.put(i,1);
			}
		}
		
		int element = 0;
		int frequency = 1;
		
		Set<Entry<Integer,Integer>> entryset = frequencyMap.entrySet();
		for(Entry<Integer,Integer> entry : entryset)
		{
			if(entry.getValue()>frequency)
			{
				element = entry.getKey();
				frequency = entry.getValue();
				
			}
		}
		
		if(frequency>1)
		{
			System.out.println("Input Array is : "+Arrays.toString(inputArray));
			System.out.println("Most Frequent Element is : "+element);
			System.out.println("Occurance Of Element is : "+frequency);
			
		}
		else
		{
			System.out.println("Input Array is : "+Arrays.toString(inputArray));
			System.out.println("All Elements in the Given Array Are Unique");
			
		}
 	}
}
