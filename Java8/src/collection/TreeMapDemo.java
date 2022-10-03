package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * ShortMap by value
 * 
 * @author HRISHAV KUMAR BAGARI
 *
 */
public class TreeMapDemo {
      
	public static void main(String[] args) {
		Map<String , String > map2=new TreeMap<>();
		map2.put("Hrishabh", "Satna");
		map2.put("Abhinav", "Rewa");
		map2.put("Akhand", "Bihar");
		map2.put("Ashish", "Sitamdhi");
		map2.put("Neha", "Satna");
		System.out.println(map2);
		
     
		for(Map.Entry<String, String >e:map2.entrySet()) {
			System.out.println(e.getKey() + " "+ e.getValue()); 
		
		}
	}
}
