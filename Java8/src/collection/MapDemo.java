package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Hrishabh");
		map.put(2, "Sumbh");
		map.put(3, "Nishubh");
		map.put(4, "Ramesh");
		map.put(5, "Ravi");
		map.put(6, "Saurabh");
		System.out.println(map);
		System.out.println("%%%%%%%%%%%%%%%%%%%%");

		Map<String, String> map2 = new HashMap<>();

		map2.put("Hrishabh", "Satna");
		map2.put("Abhinav", "Rewa");
		map2.put("Akhand", "Bihar");
		map2.put("Ashish", "Sitamdhi");
		map2.put("Neha", "Satna");
		System.out.println(map2);
		System.out.println("********************");

		String value = map.get(2);
		System.out.println(value);

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> key = keySet.iterator();
		while (key.hasNext()) {
			System.out.println(key.next());
		}
		System.out.println("*****************");

		Collection<String> values = map2.values();
		Iterator<String> v = values.iterator();
		while (v.hasNext()) {
			System.out.println(v.next());
		}

		System.out.println("*******************");
		values.forEach(System.out::println);
		System.out.println("Key value pair*********");
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());

		}

	}
}
