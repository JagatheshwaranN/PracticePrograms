package java_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_CompareTwoFiles {

	public static void main(String ar[]) throws IOException {

		BufferedReader reader1 = new BufferedReader(new FileReader("E://ECLIPSE ENV//WorkSpace//JavaBasics/File1.txt"));
		BufferedReader reader2 = new BufferedReader(new FileReader("E://ECLIPSE ENV//WorkSpace//JavaBasics/File2.txt"));

		String line1 = reader1.readLine();
		String line2 = reader2.readLine();

		int linenumber = 1;
		boolean areEqual = true;

		while (line1 != null || line2 != null) {
		
			if (line1 == null || line2 == null) {
				areEqual = false;
				break;
			} else if (!line1.equalsIgnoreCase(line2)) {
				areEqual = false;
				break;
			}

			line1 = reader1.readLine();
			line2 = reader2.readLine();
			linenumber++;
		}

		if (areEqual) {
			System.out.println(areEqual);
			System.out.println("Two Files have Same content");
		} else {
			System.out.println(areEqual);
			System.out.println("Two files content is differ in line " + linenumber);
			System.out.println("File1 is " + line1 + " and File2 is " + line2 + " at line " + linenumber);
		}
		reader1.close();
		reader2.close();
	}

}
