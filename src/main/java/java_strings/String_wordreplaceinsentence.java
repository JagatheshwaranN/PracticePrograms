package java_strings;


public class String_wordreplaceinsentence {

	
	public static void main(String[] args) {
		 

		String sentence = "i like java";
		String reverseSentence = "";
		
		String []sen = sentence.split(" ");
		
		int len = sen.length;
		
		for(int i = len-1; i >= 0; i--)
		{
			reverseSentence = reverseSentence+(sen[i]+" ");
		}
		System.out.println(reverseSentence);

	}
}

