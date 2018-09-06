package java_arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertingHashMapToArrayList {
	

	public static void main(String ar[]) {
		HashMap<String, String> student = new HashMap<String, String>();
		student.put("Arun", "Good");
		student.put("Baskar", "Average");
		student.put("Jagan", "Bad");

		Set<String> keys = student.keySet();
		ArrayList<String> keysofStudent = new ArrayList<String>(keys);
		System.out.println("The Keys of the Student HashMap are as follows ...");
		for (String key : keysofStudent) {
			System.out.println(key);
		}

		Collection<String> value = student.values();
		ArrayList<String> valuesofStudent = new ArrayList<String>(value);
		System.out.println("The values of the Student HashMap are as follows ...");
		for (String values : valuesofStudent) {
			System.out.println(values);
		}

		Set<Entry<String, String>> entries = student.entrySet();
		ArrayList<Entry<String, String>> listofStudents = new ArrayList<Entry<String, String>>(entries);
		System.out.println("The Key Value pair of the Student HashMap are as follows ...");
		for (Entry<String, String> entry : listofStudents) {
			System.out.println(entry);
		}

	}

}
