package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
public interface java.util.Set<E> extends java.util.Collection<E>  {
  public abstract int size();
  public abstract boolean isEmpty();
  public abstract boolean contains(java.lang.Object);
  public abstract java.util.Iterator<E> iterator();
  public abstract java.lang.Object[] toArray();
  public abstract <T> T[] toArray(T[]);
  public abstract boolean add(E);
  public abstract boolean remove(java.lang.Object);
  public abstract boolean containsAll(java.util.Collection<?>);
  public abstract boolean addAll(java.util.Collection<? extends E>);
  public abstract boolean retainAll(java.util.Collection<?>);
  public abstract boolean removeAll(java.util.Collection<?>);
  public abstract void clear();
  public abstract boolean equals(java.lang.Object);
  public abstract int hashCode();
  public java.util.Spliterator<E> spliterator();
 * 
 * 
 *   Q: Contract  between equals and hashCode() 
 *   */

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> s1=new HashSet<>();
         s1.add(10);
         s1.add(11);
         s1.add(10);
         s1.add(4);
         s1.add(10);
         s1.add(null);
         
        // System.out.println(s1.size());
         for(Integer s4:s1) {  
        	 System.out.println(s4);
        	
        	 
         }
         
         System.out.println(s1);
//         
//         for(int i=0;i<s1.size();i++) {
//        	 System.out.println();
//         }
         Iterator<Integer> iterator = s1.iterator();
         while(iterator.hasNext()) {
        	 System.out.println(iterator.next());
        	 
         }
         System.out.println("******");
         
        s1.forEach(System.out::println); 
        
         
         Set<Integer> s2=new LinkedHashSet<>();
         s2.add(null);
         s2.add(23);
         s2.add(15);
         s2.add(56);
         s2.add(15);
       //  s2.add(null);
         System.out.println(s2.size());
         System.out.println(s2);
         
         Set<Integer> s3=new TreeSet<>(); //by default sorted order
         s3.add(23);
         s3.add(15);
         s3.add(56);
         s3.add(15);
        // s3.add(null);
         System.out.println(s3.size());
         System.out.println(s3);
         
       
         
        
	}

}
