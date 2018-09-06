package java_strings;

public class StringReverseRecursive {

	
	public static String reversestr(String str)
	{
		if((str==null)||(str.length()<=1))
		{
			return str;
		}
		System.out.println(reversestr(str.substring(1)) + str.charAt(0));
		return reversestr(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) {
		
		
		
		String strrev = StringReverseRecursive.reversestr("jungle");
		System.out.println(strrev);

}

}