package java_excercises;

public class SwapTwoNumbers {

	public static void main(String a[]) {
		int x = 10, y = 5;
		System.out.println("Before Swap");
		System.out.println("x= " + x + " and " + "y= " + y);
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After Swap");
		System.out.println("x= " + x + " and " + "y= " + y);

	}

}
