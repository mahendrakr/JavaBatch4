package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Inheritance.E;

public class MapHashmap {

	public static void main(String[] args) {
		/**
		 * ############## Hashmap ########################
		 * 
		 * HashMap is non synchronized. It is not-thread safe and can't be shared
		 * between many threads without proper synchronization code. We can make the
		 * HashMap as synchronized by calling this code - Map m =
		 * Collections.synchronizedMap(hashMap); HashMap inherits AbstractMap class.
		 */

		// HashMap hm = new HashMap();
		Map<Integer, String> hm = new HashMap<>();
		// Map hm=new HashMap();
		Map<Integer, String> hm1 = new HashMap<>();

		// put method
		hm.put(0, "abc");
		hm.put(1, null);
		hm.put(2, "ghi");
		hm.put(3, null);
		hm.put(4, "mno");
		hm.put(5, "pqr");
		hm.put(6, null);
		hm.put(7, "vwx");
		hm.put(null, "yz");
		/**
		 * ###################### HashTable #########################
		 * 
		 * Hashtable is synchronized. It is thread-safe. Hashtable is a legacy class.
		 * Hashtable inherits Dictionary class. The initial default capacity of
		 * Hashtable class is 11 whereas loadFactor is 0.75.
		 */
		Hashtable ht = new Hashtable();
		// Hashtable<Integer , String> ht=new Hashtable<>();

		ht.put(1, "lakshy");
		ht.put(2, "akshy");
		ht.put(3, "kshy");
		ht.put(4, "kshy");
		ht.put(5, "shy");
		
		//Some special methods of HashTable
		
		   //clone method
		System.out.println(ht.clone());
		

		// now call all over things

		

		System.out.println("HashTable:" + "  " + ht);

		System.out.println("HashMap:" + "  " + hm);
		// putAll method
		hm1.putAll(hm);
		System.out.println("HashMap:" + "  " + hm1);
		// get method
		System.out.println("HashMap:" + "  " + hm.get(1)); // def

		// remove method
		// System.out.println(hm.remove(8)); //yz

		// clear method
//		 hm.clear();
//		 System.out.println(hm);
		// comtains key method
		System.out.println("HashMap:" + "  " + hm.containsKey(5)); // true

		// contains value method
		System.out.println("HashMap:" + "  " + hm.containsValue("pqr")); // true

		// isEmpty method
		System.out.println("HashMap:" + "  " + hm.isEmpty()); // false

		// keyset method -it will return all the keys as set collection.
		System.out.println("HashMap:" + "  " + hm.keySet()); // [0, 1, 2, 3, 4, 5, 6, 7]

		// 2.->
		for (Object ks : hm.keySet()) {
			System.out.println(ks);
		}

		// values method - it will give all the only values as Collection not a set.
		System.out.println("HashMap:" + "  " + hm.values()); // [abc, def, ghi, jkl, mno, pqr, stu, vwx]

		// 2.->
		for (Object kv : hm.values()) {
			System.out.println(kv);
		}

		// entrySet method - it will return all the entries as a set
		System.out.println("HashMap:" + "  " + hm.entrySet()); // [0=abc, 1=def, 2=ghi, 3=jkl, 4=mno, 5=pqr, 6=stu,
																// 7=vwx]

		// 2.->
		for (Object kv : hm.entrySet()) {
			System.out.println(kv);

		}
		System.out.println("**************************");

		/**
		 * now we use entry Interface it is a child interface of Map Interface.
		 * 
		 * if we want to work with a specific entry we use entry interface.
		 */

		// entry Methods->

		for (Map.Entry entry : hm.entrySet()) {
			// System.out.println(entry);
			System.out.println("HashMap:" + "  " + entry.getKey() + "   " + entry.getValue());
		}
		System.out.println("*********************");

		// iterator method

		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println("HashMap:" + "  " + itr.next());
//		 Map.Entry entr=(Entry) itr.next();
//		 System.out.println(entr.getKey()+"   "+entr.getValue());
//			
		}

	}
}
