package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
// what is fail safe in collection and how you can avoid it ?
/**
 * while iterating the elements from the lists using iterator if you are doing other activity like delete or add simultaneously then
 * it will throw concurrent modification exception. this process is called "fail fast" in collection.and to avoid it you can use  
 *  CopyOnWriteArrayList instead of ArrayList.then it will not throw any exception which is called as "fail safe" in collection. 
 * 
 *
 */
public class FailedSaveIterator {

	public static void main(String[] args) {
  // List<Integer> l1=new ArrayList<>();
		 List<Integer> l1=new CopyOnWriteArrayList<>();
   l1.add(10);
   l1.add(20);
   l1.add(30);
   
   Iterator<Integer> iterator = l1.iterator();
   while(iterator.hasNext()) {
	   System.out.println(iterator.next());
	   l1.add(40);
   }
   
	}

}
