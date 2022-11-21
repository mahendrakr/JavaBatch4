package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * Q1->difference between iterator and listiterator?
 * Q2->?
 
 */
public class ArrayListDemo {

	   public static void main(String[] args) {
		   //creat an object of arraylist
		ArrayList<String> al=new ArrayList<>();
	    List<String> al2=new ArrayList<>();     //always recomemded
	    List al3=new ArrayList();
		
	    System.out.println(al2.size());
	    al2.add("krishna");
	    al2.add("radhe");
	    al2.add("shyam");
	    al2.add("kalua");
	    al2.add("kalua");
	    System.out.println(al2.size());
	    System.out.println(al2);
	    
	    //access elements of list
	    //approach1->using for loop_
	    
//	       for(int i=0; i<al2.size(); i++)     {
//	    	   System.out.println(al2.get(i));
//	    	   
//	       } 
//	       //Aproach2->Using enhance for loop
//	       for(String a:al2) {
//	    	   System.out.println(a);
//	       }
//	       //Aproach3->while loop
//	       int i=0;
//	       while(i<al2.size()) {
//	    	   System.out.println(al2.get(i));
//	    	   i++;
//	       }
//	      //Aproach4-> ForEach
//	        al2.forEach(System.out::println);
	       
//	       //Approach5-> will discuse after lemda expresssion
//	        
//	       //Aproach6->using iterator
//	       Iterator<String> iterator = al2.iterator();
//	       while(iterator.hasNext()) {
//	    	   System.out.println(iterator.next());
//	    	   
//	       }
	       //Aproach7-> Using List iterator
	       ListIterator<String> listIterator = al2.listIterator();
	        while(listIterator.hasNext()) {
	        	System.out.println(listIterator.next());
	        }
	}
}
