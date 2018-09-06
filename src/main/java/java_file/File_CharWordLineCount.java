package java_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_CharWordLineCount {

	public static void main(String ar[])

	{
		BufferedReader reader = null;
		int charcount = 0;
		int wordcount = 0;
		int linecount = 0;

		try {

			reader = new BufferedReader(new FileReader("E://ECLIPSE ENV//WorkSpace//JavaBasics/FileWriter.txt"));

			String currentLine = reader.readLine();

			// System.out.println(currentLine);

			while (currentLine != null) {
				linecount++;
				
				String[] words = currentLine.split(" ");
				wordcount = wordcount + words.length;

				for (String c : words) {
					charcount = charcount + c.length();
				}
				
				currentLine = reader.readLine();
				
				System.out.println(currentLine);
			}

			System.out.println("No Of Lines > " + linecount);
			System.out.println("No Of Words > " + wordcount);
			System.out.println("No Of Chars > " + charcount);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
