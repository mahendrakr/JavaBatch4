package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetLinkedhashSet {
	public static void main(String[] args) {

		//HashSet<Integer> lhs1 = new HashSet<>();
		HashSet<Integer> lhs = new HashSet<>();

		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(500);
		System.out.println(lhs);
		
		// LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		 LinkedHashSet lhs1=new LinkedHashSet();
		
		lhs1.add(600);
		lhs1.add(700);
		lhs1.add(900);
		lhs1.add(800);

		// now time to perform some methods

	
		// 1.-add all method
		lhs.addAll(lhs1);
		System.out.println(lhs);

//        lhs1.addAll(lhs);
//        System.out.println(lhs1);

		// 3.-remove method
//        lhs1.remove(900);
//        System.out.println(lhs1);
//        
		// 4.-remove all method
//        lhs.removeAll(lhs1);
//        System.out.println(lhs);

//        lhs1.removeAll(lhs);
//        System.out.println(lhs1);
//        
		// 5-contain method
		System.out.println(lhs.contains(lhs1));
		System.out.println(lhs1.contains(lhs));

		// 6-contains all
		System.out.println(lhs.containsAll(lhs1));
		System.out.println(lhs1.containsAll(lhs));

		// 7-is empty method
		System.out.println(lhs.isEmpty());
		System.out.println(lhs1.isEmpty());

		// 8-retain method
		System.out.println(lhs.retainAll(lhs1));
		System.out.println(lhs1.retainAll(lhs));

		System.out.println("*********************************");

//        //now we performs calling methods
//        
//        //1-using for loop
//        for(int i=0; i<lhs.size(); i++){
//        	System.out.println(lhs.);
//        }
//        
		// 2-using enhance for loop
		for (Object eh : lhs) {
			System.out.println(eh);
		}
		// using foreach loop
		lhs.forEach(System.out::println);

		// using iterator

		Iterator<Integer> it = lhs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
