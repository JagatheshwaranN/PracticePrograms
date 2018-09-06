package java_arrays;

public class FindingPairOfElementsToGivenNumber {

	public static void pairOfElements(int[] arr, int num) {

		System.out.println("Pair of elements equal to " + num + " are :");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == num)
					System.out.println(arr[i] + "+" + arr[j] + "=" + num);
			}
		}
	}

	public static void main(String ar[]) {
		pairOfElements(new int[] { 2, 5, 7, 3, 5, 8, 9, 7 }, 10);
	}
}
