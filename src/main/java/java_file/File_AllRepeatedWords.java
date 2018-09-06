package java_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class File_AllRepeatedWords {

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

			Set<Entry<String, Integer>> entryset = wordcount.entrySet();

			List<Entry<String, Integer>> entry = new ArrayList<Entry<String, Integer>>(entryset);

			Collections.sort(entry, new Comparator<Entry<String, Integer>>() {

				public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {

					return (e2.getValue().compareTo(e1.getValue()));
				}
			});

			for (Entry<String, Integer> entrylist : entry) {
				if (entrylist.getValue() > 1) {

					System.out.println(entrylist.getKey() + " : " + entrylist.getValue());
				}
			}

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
