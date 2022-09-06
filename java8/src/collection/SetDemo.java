package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 
public interface java.util.Set<E> extends java.util.Collection<E> {
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
         System.out.println(s1);
         
	}

}
