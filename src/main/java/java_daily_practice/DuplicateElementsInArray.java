package java_daily_practice;
import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String ar[]) {
		String[] arr = { "a", "b", "a", "d" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j]) && i != j) {
					System.out.println("Duplicate Element in an Array : " + arr[j]);
				}
			}
		}

		HashSet<String> set = new HashSet<String>();
		for (String a : arr) {
			if (!set.add(a)) {
				System.out.println("Duplicate Element in an Array : " + a);
			}
		}

		System.out.println(set);

	}

}
