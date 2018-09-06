package java_daily_practice;

public class FindDuplicateCharsInString {
	
	public static void main(String ar[])
	{
		String text = "interview";
		char []ch = text.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&&i!=j)
				{
					System.out.println("Duplicate elements in given String are : "+ ch[j]);
					break;
				}
			}
		}
	}

}
