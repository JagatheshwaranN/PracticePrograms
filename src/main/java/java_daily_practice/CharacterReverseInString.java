package java_daily_practice;

public class CharacterReverseInString {

	public static void main(String ar[])
	{
		String input = "java";
		String reverse = "";
		
		char[] array = input.toCharArray();
		
		int len = array.length;
		
		for(int i=len-1;i>=0;i--)
		{
			reverse = reverse+array[i];
			
		}
		
		System.out.println("Reverse of character in String : "+reverse);
	}
}
