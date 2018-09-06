package java_daily_practice;

public class StringSwap {
	
	public static void main(String ar[])
	{
		String input1 = "java";
		String input2 = "j2ee";
		
		System.out.println("input 1> "+input1+"  "+"input 2> "+input2);
		
		input1 = input1+input2;
		
		System.out.println(input1.length()-input2.length());
		input2 = input1.substring(0, input1.length()-input2.length());
		
		System.out.println(input2.length());
		input1 = input1.substring(input2.length());
		
		System.out.println("input 1> "+input1+"  "+"input 2> "+input2);
	}

}
