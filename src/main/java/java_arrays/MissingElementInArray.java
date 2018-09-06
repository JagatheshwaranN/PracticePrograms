package java_arrays;

public class MissingElementInArray {

	public static int sumofNum(int num) {
		int sum = (num * (num + 1)) / 2;
		return sum;

	}

	public static int sumofElements(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;

	}

	public static void main(String at[]) {
		int num = 5;
		int ar[] = { 1, 3, 4, 2 };

		sumofNum(num);
		sumofElements(ar);

		int missingElement = sumofNum(num) - sumofElements(ar);

		System.out.println("MissingElement > " + missingElement);
	}
}
