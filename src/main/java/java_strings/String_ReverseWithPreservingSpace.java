package java_strings;

public class String_ReverseWithPreservingSpace {
	
	public static String reverseString(String str) {
		char[] chars = str.toCharArray();
		int j = chars.length-1;
		System.out.println(j);
		int i = 0;

		while(i < j) {
			
		if(chars[i] == ' ')
		//	System.out.println(chars[i]);
		i++;
		
		if(chars[j] == ' ')
		//	System.out.println(chars[j]);
		--j;

		char tmp = chars[i]; // swap (i, p)
		chars[i] = chars[j];
		chars[j] = tmp;

		i++;
		--j;
		}

		System.out.println(chars);
		return new String(chars);
		
		}
	
	public static void main(String ar[])
	{
		reverseString("i like java");
	}

}

/*static void reverseString(String inputString)
{
	//Converting inputString to char array 'inputStringArray'
	
	char[] inputStringArray = inputString.toCharArray();
	
	//Defining a new char array 'resultArray' with same size as inputStringArray
	
	char[] resultArray = new char[inputStringArray.length];
	
	//First for loop : 
	//For every space in the 'inputStringArray', 
	//we insert spaces in the 'resultArray' at the corresponding positions 
	
	for (int i = 0; i < inputStringArray.length; i++) 
	{
		if (inputStringArray[i] == ' ') 
		{
			resultArray[i] = ' ';
		}
	}
	
	//Initializing 'j' with length of resultArray
	
	int j = resultArray.length-1;
			
	//Second for loop :
	//we copy every non-space character of inputStringArray 
	//from first to last at 'j' position of resultArray
	
	for (int i = 0; i < inputStringArray.length; i++)
	{
		if (inputStringArray[i] != ' ') 
		{
			//If resultArray already has space at index j then decrementing 'j'
			
			if(resultArray[j] == ' ')
			{
				j--;
			}
			
			resultArray[j] = inputStringArray[i];
			
			j--;
		}
	}
	
	System.out.println(inputString+" ---> "+String.valueOf(resultArray));
}*/