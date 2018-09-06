package java_excercises;

public class Star_Traingle {

	
	public static void main(String[] args) {
		int n = 5;
		int i, j = 0, k = 0;
		
		for(i = 1; i <= n; i++)
		{
			for(j = n-1; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(k = 1; k <= (2*i-1); k++)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
		}

	}

}
