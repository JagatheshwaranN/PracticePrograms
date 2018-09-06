package java_strings;

public class String_Concate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		String word1 = "Hello";
		String word2 = "Java";
		
		String word3 =" ";
		
		char []a = word1.toCharArray();
		char []b = word2.toCharArray();
		
		int alen = a.length;
		int blen = b.length;
		
		for(int i = 0; i<alen; i++ )
		{
			word3 = word3+a[i];
		}

		for(int j = 0; j<blen; j++)
		{
			word3 = word3+b[j];
		}
		
		System.out.println(word3);
	}

}
