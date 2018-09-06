package java_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File_AppendText {
	
	public static void main(String ar[])
	{
		
		FileWriter file = null;
		BufferedWriter buff = null;
		PrintWriter prnt = null;
		try
		{
		file = new FileWriter("E:\\ECLIPSE ENV\\WorkSpace\\JavaBasics\\DeShaw.txt", true);
		buff = new BufferedWriter(file);
		prnt = new PrintWriter(buff);
		
		prnt.println();
		prnt.println("arul");
		prnt.println("kumar");
		System.out.println("Done");
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				prnt.close();
				buff.close();
				file.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
