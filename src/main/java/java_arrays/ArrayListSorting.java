package java_arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String ar[]) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("baskar");
		arr.add("Arun");
		arr.add("Chandran");
		Collections.sort(arr);

		System.out.println("ArrayList after Sort > " + arr);

		Collections.sort(arr, String.CASE_INSENSITIVE_ORDER);

		System.out.println("ArrayList after Sort with Case Insensitivity > " + arr);

		 Collections.sort(arr, Collections.reverseOrder());
		 
		 System.out.println("ArrayList after Sort In Reverse Order > " + arr);
		 
		 
	}

}
