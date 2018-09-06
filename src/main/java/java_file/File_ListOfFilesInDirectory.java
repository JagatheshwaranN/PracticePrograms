package java_file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class File_ListOfFilesInDirectory {

	public static void listFiles(String path) {
		
		File dir = new File(path);

		File[] files = dir.listFiles();

		System.out.println(
				"****************** Listing of Files and SubDir Files using File.listFiles() ********************");
		for (File file : files) {
			if (file.isFile()) {
				System.out.println(file.getName());
			} else if (file.isDirectory()) {
				listFiles(file.getAbsolutePath());
			}
		}
	}

	public static void main(String ae[]) {

		File dir = new File("E://ECLIPSE ENV//WorkSpace//JavaBasics//Files");

		// File.list()
		String files[] = dir.list();
		System.out.println("****************** Listing of Files using File.list() ********************");
		for (String file : files) {
			System.out.println(file);
		}

		// File.listFiles()
		File fs1[] = dir.listFiles();
		System.out.println("****************** Listing of Files using File.listFiles() ********************");
		for (File f1 : fs1) {
			System.out.println(f1.getName());
		}

		// File.listFiles(FilenameFilter filter)
		FilenameFilter filter = new FilenameFilter() {

			public boolean accept(File dir, String name) {

				if (name.endsWith(".xlsx")) {
					return true;
				}
				return false;
			}

		};

		File fs2[] = dir.listFiles(filter);
		System.out.println(
				"****************** Listing of Files using File.listFiles(FilenameFilter filter) ********************");
		for (File f2 : fs2) {
			System.out.println(f2.getName());
		}

		// File.listFiles(FileFilter filter)
		FileFilter filter1 = new FileFilter() {

			public boolean accept(File file) {
				if (file.length() < 10 * 1024 * 1024) {
					return true;
				}

				return false;
			}

		};

		File[] fs3 = dir.listFiles(filter1);
		System.out.println(
				"****************** Listing of Files using File.listFiles(FileFilter filter) ********************");
		for (File f3 : fs3) {
			System.out.println(f3.getName());
		}

		// To List only files in the Directory
		File[] fs4 = dir.listFiles();
		System.out.println("****************** Listing of Files only using File.listFiles() ********************");
		for (File f4 : fs4) {
			if (f4.isFile()) {
				System.out.println(f4.getName());
			}
		}

		// To List only sub directories in the Directory
		File[] fs5 = dir.listFiles();
		System.out.println(
				"****************** Listing of sub directories only using File.listFiles() ********************");
		for (File f5 : fs5) {

			if (f5.isDirectory()) {
				System.out.println(f5.getName());
			}

		}

		File_ListOfFilesInDirectory.listFiles("E://ECLIPSE ENV//WorkSpace//JavaBasics//Files");
	}

}
