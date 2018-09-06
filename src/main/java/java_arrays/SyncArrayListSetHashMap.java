package java_arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SyncArrayListSetHashMap {

	public static void main(String ar[]) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("IVTL");
		array.add("FreshWorks");

		List<String> syncArray = Collections.synchronizedList(array);

		synchronized (syncArray) {
			System.out.println("*******Synchronized ArrayList*******");
			Iterator<String> arrayIterator = syncArray.iterator();
			while (arrayIterator.hasNext()) {
				System.out.println(arrayIterator.next());
			}
		}

		HashSet<String> set = new HashSet<String>();
		set.add("IVTL");
		set.add("FreshWorks");

		Set<String> syncSet = Collections.synchronizedSet(set);

		synchronized (syncSet) {
			System.out.println("*******Synchronized HashSet*******");
			Iterator<String> setIterator = syncSet.iterator();
			while (setIterator.hasNext()) {
				System.out.println(setIterator.next());
			}
		}

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("IVTL", 1);
		hashMap.put("FreshWorks", 2);

		Map<String, Integer> syncMap = Collections.synchronizedMap(hashMap);

		Set<String> mapKeys = syncMap.keySet();

		synchronized (mapKeys) {
			System.out.println("*******Synchronized HashMap Keys*******");
			Iterator<String> keyIterator = mapKeys.iterator();
			while (keyIterator.hasNext()) {
				System.out.println(keyIterator.next());
			}
		}

		Collection<Integer> mapValues = syncMap.values();
		synchronized (mapValues) {
			System.out.println("*******Synchronized HashMap Values*******");
			Iterator<Integer> valueIterator = mapValues.iterator();
			while (valueIterator.hasNext()) {
				System.out.println(valueIterator.next());
			}
		}

	}
}
