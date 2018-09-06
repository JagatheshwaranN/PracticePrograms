package java_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_ReplaceContent {

	public static void modifyFileContent(String filepath, String oldStr, String newStr) {
		File modifyFile = new File(filepath);
		BufferedReader reader = null;
		FileWriter writer = null;
		String oldContent = "";

		try {
			reader = new BufferedReader(new FileReader(modifyFile));
			String line = reader.readLine();
			while (line != null) {
				oldContent = oldContent + line + System.lineSeparator();
				//System.out.println(oldContent);
				line = reader.readLine();
			}

			String newContent = oldContent.replaceAll(oldStr, newStr);
			writer = new FileWriter(modifyFile);
			writer.write(newContent);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}

	public static void main(String ar[]) {
		modifyFileContent("E://ECLIPSE ENV//WorkSpace//JavaBasics/FileContentReplace.txt", "85", "98");
		System.out.println("MOdification of File is Done");
	}

}
