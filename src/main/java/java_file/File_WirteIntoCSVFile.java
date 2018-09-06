package java_file;

import java.io.FileWriter;
import java.io.IOException;

public class File_WirteIntoCSVFile {

	public static void main(String ar[]) {
		
		String filePath = "E://ECLIPSE ENV//WorkSpace//JavaBasics//Files/writeCSV.csv";
		
		File_WirteIntoCSVFile.writeCSV(filePath);
	}

	public static void writeCSV(String filePath) {
		FileWriter writer = null;

		try {
			writer = new FileWriter(filePath);
			writer.append("Name");
			writer.append(',');
			writer.append("Age");
			writer.append('\n');
			
			writer.append("John");
			writer.append(',');
			writer.append("25");
			writer.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Write CSV File is complete");
	}
}
