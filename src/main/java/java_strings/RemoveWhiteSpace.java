package java_strings;

public class RemoveWhiteSpace {

	
	public static void main(String[] args) {

		
		String str = "i like to   program";
		
		/*String str1 = str.replaceAll("\\s", "");
		
		System.out.println(str1);*/
		
		StringBuilder s = new StringBuilder();
		
		char[] arr = str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
		if((arr[i]!=' ')&&(arr[i]!='\t'))
		{
		  s.append(arr[i]);	
		}
		}
		System.out.println(s.toString());
	}

}
