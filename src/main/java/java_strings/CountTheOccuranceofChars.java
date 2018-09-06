package java_strings;

public class CountTheOccuranceofChars {

	
	public static void main(String[] args) {
		
		String s = "jagawaran";
		
		if(s!=null)
		{
			
			System.out.println(s.length());
			System.out.println(s.replace("a", "").length());
			int count = s.length() - s.replace("a","").length();
			System.out.println(count);
		}
			
		

	}

}
