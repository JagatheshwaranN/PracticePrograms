package java_strings;


public class String_characterreverse {

	public static void main(String[] args) {
		
		String word = "java";
		String rev="";
		
		char []a = word.toCharArray();
		int alen = a.length;
		
		for(int i = alen-1; i >= 0; i-- )
		{
			rev += a[i];
		}
		System.out.println(rev);
	}

}
