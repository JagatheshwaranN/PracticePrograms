package java_excercises;

public class BinaryOrNot {

	public static void checkBinaryOrNot(int number) {
		boolean binary = true;
		int cnumber = number;

		while (cnumber != 0) {
			int temp = cnumber % 10;
			System.out.println(temp);

			if (temp > 1) {
				binary = false;
				break;
			} else {
				cnumber = cnumber / 10;
				System.out.println(cnumber);
			}
		}
		if (binary)

		{
			System.out.println("Given number is binary");
		} else {
			System.out.println("Given number is not binary");
		}
	}

	public static void main(String ar[]) {
		checkBinaryOrNot(1101);
		checkBinaryOrNot(1234);
	}

}
