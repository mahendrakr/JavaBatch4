package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * String []arr={"A","B","A","C","B","D","A"}; print that using java.
 * 
 
 */
public class Questions {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String[] arr = { "A", "B", "A", "C", "B", "D", "A" };
		for (String s : arr) {
			if (map.containsKey(s)) {
				int v = map.get(s);
				v = v + 1;
				map.put(s, v);

			} else {
				map.put(s, 1);
			}

		}
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + "   " + e.getValue());
		}

	}
}
