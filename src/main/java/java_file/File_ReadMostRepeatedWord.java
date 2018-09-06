package java_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class File_ReadMostRepeatedWord {

	public static void main(String ar[])

	{
		HashMap<String, Integer> wordcount = new HashMap<String, Integer>();
		BufferedReader reader = null;

		try {

			reader = new BufferedReader(new FileReader("E://ECLIPSE ENV//WorkSpace//JavaBasics/FileWriter.txt"));

			String currentLine = reader.readLine();

			while (currentLine != null) {

				String[] words = currentLine.toLowerCase().split(" ");

				for (String word : words) {

					if (wordcount.containsKey(word)) {
						wordcount.put(word, wordcount.get(word) + 1);
					} else {
						wordcount.put(word, 1);
					}

				}

				currentLine = reader.readLine();
			}

			String mostRepeatedWord = null;
			int count = 0;

			Set<Entry<String, Integer>> entryset = wordcount.entrySet();
			for (Entry<String, Integer> entry : entryset) {
				if (entry.getValue() > count) {
					mostRepeatedWord = entry.getKey();
					count = entry.getValue();
				}
			}

			System.out.println("The most repeated word in the file is : " + mostRepeatedWord);

			System.out.println("Number Of Occurrences : " + count);

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
