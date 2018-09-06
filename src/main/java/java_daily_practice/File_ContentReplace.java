package java_daily_practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class File_ContentReplace {

	public static void main(String ar[]) {
		modifyFile("E:\\ECLIPSE ENV\\WorkSpace\\JavaBasics\\Deshaw.txt", "is", "was");
		System.out.println("Content replacement is done");
	}

	public static void modifyFile(String filepath, String oldContent, String newContent) {

		File modify = new File(filepath);
		BufferedReader br = null;
		FileWriter fw = null;
		String oldStr = "";
		try {
			br = new BufferedReader(new FileReader(modify));
			String line = br.readLine();
			while (line != null) {
				oldStr = oldStr + line + System.lineSeparator();
				line = br.readLine();
			}
			String newStr = oldStr.replace(oldContent, newContent);
			fw = new FileWriter(modify);
			fw.write(newStr);

			fw.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
