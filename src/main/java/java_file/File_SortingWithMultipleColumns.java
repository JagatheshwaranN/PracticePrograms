package java_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class company {
	String companyname = null;
	int num = 0;

	company(String companyname, int num) {
		this.companyname = companyname;
		this.num = num;
	}
}

class companycomp implements Comparator<company> {

	public int compare(company c1, company c2) {

		return c1.companyname.compareTo(c2.companyname);
	}

}

class number implements Comparator<company> {

	public int compare(company o1, company o2) {

		return o2.num - o1.num;
	}

}

public class File_SortingWithMultipleColumns {

	public static void main(String ar[]) throws IOException {

		BufferedReader reader = null;
		BufferedWriter writer = null;
		ArrayList<company> list = new ArrayList<company>();

		reader = new BufferedReader(new FileReader("E://ECLIPSE ENV//WorkSpace//JavaBasics/input1.txt"));
		String currentLine = reader.readLine();
		while (currentLine != null) {

			String companyDetail[] = currentLine.split(" ");
			String company = companyDetail[0];
			int num = Integer.valueOf(companyDetail[1]);
			list.add(new company(company, num));
			currentLine = reader.readLine();
		}

		Collections.sort(list, new number());

		writer = new BufferedWriter(new FileWriter("E://ECLIPSE ENV//WorkSpace//JavaBasics/output1.txt"));
		for (company line : list) {
			writer.write(line.companyname);
			writer.write(" " + line.num);
			writer.newLine();
		}

		reader.close();
		writer.close();
	}

}
