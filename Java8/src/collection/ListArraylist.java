package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListArraylist {
	static int i;
      
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(1);
		al.add('a');
		al.add("never");
		al.add(30.2f);
		al.add(true);
		System.out.println(al);
		
		// we have many ways to creat Arraylistobject.
		List al1=new ArrayList();
		al1.add(2);
		al1.add('a');
		al1.add(true);
		al1.add("dada");
		al1.add(2);
		
		System.out.println (al1.get(0));
		
		System.out.println(al1);
		 // now we can perform methods
		//1.remove method
		System.out.println(al.remove(1));
		System.out.println(al);
		
//		//2.remove all 
//		al.removeAll(al);
//		System.out.println(al);
		al.removeAll(al1);
		System.out.println(al);
		System.out.println("#############################");
		
		//3.isempty
		
		System.out.println(al.isEmpty());
		
		//3. addall
		al.addAll(al1);
		System.out.println(al);
		
		//4. set method
		al.set(7, 3);
		System.out.println(al);
		
		//5. get method
	    System.out.println(al.get(3));
	    System.out.println(al);
	    
	    //6.contains and containsall method
		
		System.out.println(al.contains(2));
		System.out.println("***************************************");
		
		
		//some calling methods
		
		List<Integer> al2=new ArrayList<>();
		al2.add(0);
		al2.add(4);
		al2.add(3);
		al2.add(2);
		al2.add(1);
	
		List<String> al3=new ArrayList<>();
		al3.add("akta");
		al3.add("hmari");
		al3.add("barkarar");
		al3.add("rahe");
		al3.add("jay ho");
		// now we are going to perforn sorting order
		
		 Collections.sort(al3);
		 System.out.println(al3);
		 
		 // now we are going to perform random order
		 
		 Collections.shuffle(al3);
		System.out.println(al3);
				
		//now reverse order 
		Collections.reverse(al3);
		System.out.println(al3);
		
		
		
		// using for loop
		for(int i=0; i<al3.size(); i++) {
			System.out.println(al3.get(i));
		}
		//using enhance for loop
		for (Integer e:al2) {
			System.out.println(e);
		}
	//using while loop	
		while(i<al3.size()) {
			System.out.println(al3.get(i));
			i++;
		}
		//using forEach loop
		al2.forEach(System.out::println);
		
		//using iterator
		
		Iterator at=al3.iterator();
		while(at.hasNext()) {
			System.out.println(at.next());
		}
		
	}
}
