package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListLinkedlist {
	static int i;

	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add(0, "yug");
		li.add(1, "Hrishabh");
		li.add(2, "Bata");
		System.out.println("*********************");
		// Linked List special methods
		li.addFirst("Frist");
		li.addLast("Last");
//		li.removeFirst();
//		li.removeLast();
		System.out.println("*************************");
		
		// Linked list methods
		System.out.println(li);
		// contains method
		System.out.println(li.contains("yug"));
//1	//remove method
//	li.remove(1);
//	System.out.println(li);
//2	li.removeAll(li);
//	System.out.println(li);
//	
		LinkedList<Integer> li1 = new LinkedList<>();
		li1.add(1);
		li1.add(3);
		li1.add(1);
		li1.add(3);
		li1.add(1);
		li1.add(3);

		System.out.println(li1);

		li1.addAll(li);
		System.out.println(li1);

		// set method
		li1.set(2, 4);
		System.out.println(li1);
		// get method
		System.out.println(li1.get(2));
		// contain method
		System.out.println(li1.contains("yug")); // true
		// contains all method
		System.out.println(li1.containsAll(li1)); // true

		// now some calling methods
		System.out.println("**********************************");
		// 1. using for loop-
		for (int i = 0; i < li1.size(); i++) {
			System.out.println(li1.get(i));
		}
		// 2. using while loop-

		while (i < li1.size()) {
			System.out.println(li1.get(i));
			i++;
		}
		
		//using foreach loop
		
	  //  li1.forEach(System.out::println);
		
		//using enhance for loop
		for(Object lt:li1) {
			System.out.println(lt);
		}
		System.out.println("********************8");
		//using iterator method
		Iterator it=li1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("***********************");
        //now we are going to perform some  sorting method
		
//		//1.- using sort
//		
//		Collections.sort(li1);
//		System.out.println(li1);
		
		//2.-random order by shuffle method
		Collections.shuffle(li1);
		System.out.println(li1);
		
		//3.- reverse order
		Collections.reverse(li1);
		System.out.println(li1);
	}
}
