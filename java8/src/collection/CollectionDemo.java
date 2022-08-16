package collection;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
    ArrayList al=new ArrayList();  // by default type is object .
    al.add(10);
    al.add("subodh");
    al.add(550.50);
    
	
    for(int i=0; i<al.size();i++) {
    	//System.out.println(al.get(i));
    String name=(String)al.get(i);
    System.out.println(name);
    }
    ArrayList<Integer> al2=new ArrayList<Integer>();  //only Integer type is valid.
    ArrayList<Integer> al3=new ArrayList<>();
    al3.add(10);
    al3.add(20);
    al=al3;
    al2=al3;
    al3=al;
    
    Integer i=10;
    String s="20";
    //i=s;
    
    	
    
}
}
