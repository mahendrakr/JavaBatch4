package collection;
/**
 * we can add two list without using forloop by using addAll() method.
 * 
 *
Compiled from "List.java"
public interface java.util.List<E> extends java.util.Collection<E> {
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
  public abstract boolean addAll(int, java.util.Collection<? extends E>);
  public abstract boolean removeAll(java.util.Collection<?>);
  public abstract boolean retainAll(java.util.Collection<?>);
  public void replaceAll(java.util.function.UnaryOperator<E>);
  public void sort(java.util.Comparator<? super E>);
  public abstract void clear();
  public abstract boolean equals(java.lang.Object);
  public abstract int hashCode();
  public abstract E get(int);
  public abstract E set(int, E);
  public abstract void add(int, E);
  public abstract E remove(int);
  public abstract int indexOf(java.lang.Object);
  public abstract int lastIndexOf(java.lang.Object);
  public abstract java.util.ListIterator<E> listIterator();
  public abstract java.util.ListIterator<E> listIterator(int);
  public abstract java.util.List<E> subList(int, int);
  public java.util.Spliterator<E> spliterator();

 * 
 */
import java.util.ArrayList;
import java.util.List;

public class ArraylistMethods {

	public static void main(String[] args) {
    List<Integer> l1=new ArrayList<>();
    l1.add(10);
    l1.add(2);
    l1.add(45);
    l1.add(32);
    l1.add(40);
    l1.add(30);
     
    List<Integer> l2=new ArrayList<>();
    l2.add(30);
    l2.add(40);
    
    
   // for(int a:l1) {
    //	l2.add(a);
    	
    //}
    l2.addAll(l1);
    System.out.println(l2);
    //l2.remove(3);
    //System.out.println(l2);
  //  l2.removeAll(l1);
   // l2.retainAll(l1);
    
    if(l1.containsAll(l2)) {
   System.out.println("true");
    
	}
    else
    	System.out.println("false");
	}
}
