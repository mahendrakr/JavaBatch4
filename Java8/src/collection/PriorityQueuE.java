package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

import Inheritance.E;

public class PriorityQueuE {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();

		// we have two methods to add elememt 1- Add and 2- offer

		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		System.out.println(pq); // [100, 200, 300, 400, 500]

		PriorityQueue pq1 = new PriorityQueue();

		pq1.offer(200);
		pq1.offer(600);
		pq1.offer(700);
		pq1.offer(800);
		System.out.println(pq1); // [200, 600, 700, 800]

		// 1 //we have 2 methods to find head element. 1-element 2- peek
		System.out.println(pq.element()); // 100
		// but when queue is empty then element method throw the exception-
		// NoSuchElementException

		System.out.println(pq1.peek()); // 200
		// if queue is empty peek method return null not exception.

		// 2 //we have 2 methods to remove the element but before removing it will
		// return the value. 1-remove 2-poll

		System.out.println(pq.remove()); // 100
		// if queue is empty then remove method will give
		// excotion-NoSuchElementException
		System.out.println(pq.poll()); // 200
		// if queue is empty then it will return null.
        System.out.println("**********************");
        System.out.println("pq:"+pq);
        System.out.println("pq1:"+pq1);
        //AddAll method
		pq.addAll(pq1);
		System.out.println(pq);
		
		//RemoveAll method
		pq.removeAll(pq1);
		System.out.println(pq);
		
		
		//Calling methods
		
		//1//using iterator
		System.out.println("*******************");
		Iterator itr=pq1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//2//using foreach 
		pq.forEach(System.out::println);
		
		//3//using enhance for loop
		for(Object ef:pq) {
			System.out.println(ef);
		}
		

	}
}
