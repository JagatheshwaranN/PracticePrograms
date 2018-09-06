package java_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToArrayList {

	public static void main(String ar[]) {
		

		String[] array = new String[] { "IVTL", "FreshWorks" };

		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));

		System.out.println("ArrayToArrayList using Arrays.asList > > " + arrayList);

		ArrayList<String> arrList = new ArrayList<String>();
		Collections.addAll(arrList, array);

		System.out.println("ArrayToArrayList using Collections.addAll > > " + arrList);

		ArrayList<String> arlist = new ArrayList<String>();
		arlist.addAll(Arrays.asList(array));

		System.out.println("ArrayToArrayList using ArrayList.addAll > > " + arlist);

		List<Object> list = Arrays.stream(array).collect(Collectors.toList());

		System.out.println("ArrayToArrayList using Java Stream > > " + list);

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("IVTL");
		arr.add("FreshWorks");

		String[] array1 = new String[arr.size()];
		arr.toArray(array1);

		for (String a : array1) {
			System.out.println("ArrayListToArray > > " + a);
		}

	}
}
