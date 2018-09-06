package java_arrays;

public class FindingEqualityOfArrays {
	

	public static void main(String ar[]) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 1, 2, 3, 4 };

		boolean equality = true;

		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					equality = false;
				}
			}
		} else {
			equality = false;

		}

		if (equality) {
			System.out.println("Arrays a1 and a2 are equal");
		} else {
			System.out.println("Arrays a1 and a2 are not equal");
		}

	}
	
	// Arrays.equals(a1,a2); - for 1d array
	// Arrays.deepEquals(a1,a2); - for 2d array
}