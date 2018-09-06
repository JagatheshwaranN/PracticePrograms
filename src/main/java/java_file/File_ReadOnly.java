package java_file;

import java.io.File;

public class File_ReadOnly {

	public static void main(String ar[]) {
		
		File file = new File("E://ECLIPSE ENV//WorkSpace//JavaBasics/FileWriter.txt");
		Boolean result = file.setReadOnly();
		if (result) {
			System.out.println("File is read only");
		} else {
			System.out.println("File is Writable");
		}

		File file1 = new File("E://ECLIPSE ENV//WorkSpace//JavaBasics/FileWriter.txt");
		Boolean result1 = file1.setWritable(false);
		if (result1) {
			System.out.println("File is read only");
		} else {
			System.out.println("File is Writable");
		}

		File file2 = new File("E://ECLIPSE ENV//WorkSpace//JavaBasics/FileWriter.txt");
		file2.setWritable(false);
		if (file2.canWrite()) {
			System.out.println("File is Writable");
		} else {
			System.out.println("File is read only");
		}

		File file3 = new File("E://ECLIPSE ENV//WorkSpace//JavaBasics/FileWriter.txt");
		file3.setReadOnly();
		if (file3.canWrite()) {
			System.out.println("File is Writable");
		} else {
			System.out.println("File is read only");
		}
	}
}
