package java_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class File_Sorting {

	public static void main(String ar[]) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			reader = new BufferedReader(new FileReader("E://ECLIPSE ENV//WorkSpace//JavaBasics/input.txt"));
			String currentLine = reader.readLine();
			while (currentLine != null) {
				list.add(currentLine);
				currentLine = reader.readLine();
			}

			Collections.sort(list);

			writer = new BufferedWriter(new FileWriter("E://ECLIPSE ENV//WorkSpace//JavaBasics/output.txt"));
			for (String line : list) {
				writer.write(line);
				writer.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}
	}

}
