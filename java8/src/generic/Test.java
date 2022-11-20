package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
   Student<String> s=new Student<>(); // here base is Student and <String> is parameter.
   s.add("subodh");
   Student<Integer> s1=new Student<>();
   s1.add(10);
   //s=s1;
   Student<Double> s2=new Student<>();
   s2.add(12.60);
   Student<Character> s3=new Student<>();
   s3.add('A');
   Animal<Character,Integer> a=new Animal<>();
   a.add('A', 20);
   Animal<String,String> a1=new Animal<>();
   //ArrayList<E>
   // LinkedList<E>
   ArrayList<Integer> al=new ArrayList<>();
   // HashMap<K,V>
   HashMap<String, String> map=new HashMap<>();
   LinkedList<Integer> lid=new LinkedList<>();
   
   //Student<Object> s4=new Student<Integer>(); // Invalid because Polymorphism is applicable on base type not on parameter Type.
   List<Integer> l=new ArrayList<>();
   List<Integer> l1=new LinkedList<>();
   Map<String,String> map1=new HashMap<>();
   Person<Parent> p=new Person<>(); // bounded type
   Person<Child> p1=new Person<>();
   //Cow<ImplA> c1=new Cow<>();
   //Cow<InterA> c2=new Cow<>();
  // Cow<String> c3=new Cow<>();
   
   
   
   
   
   
   
	}

}
