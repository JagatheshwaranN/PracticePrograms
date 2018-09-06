package java_strings;

public class RotationOfStringVersion {
	
	public static void main(String ar[])
	{
		String s1 = "JagaWaran";
		String s2 = "WaranJaga";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("String s2 is not rotated version of String s1");
		}
		
		else
		{
			String s3 = s1+s1;
			
			if(s3.contains(s2))
			{
				System.out.println("String s2 is rotated version of String s1");
			}
			else
			{
				System.out.println("String s2 is not rotated version of String s1");
			}
		}
	}

}
