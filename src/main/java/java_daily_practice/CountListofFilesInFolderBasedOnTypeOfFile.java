package java_daily_practice;

import java.io.File;

public class CountListofFilesInFolderBasedOnTypeOfFile {

	public static void main(String ar[]) {
		
		File file = new File("E:\\ECLIPSE ENV\\WorkSpace\\JavaBasics\\Files");
		File[] files = file.listFiles();
		int fileCounts = files.length;

		System.out.println("File counts in Given Folder : " + fileCounts);

		int count = 0;

		for (File f : files) {
			if (f.isFile()) {
				String fileExn = f.getName();

				if (fileExn.contains(".txt")) {
					System.out.println(f.getName());
					//System.out.println(f.lastModified());
					count++;
				}
			}
		}
		System.out.println("File counts based on Type of File : " + count);
	}

}
