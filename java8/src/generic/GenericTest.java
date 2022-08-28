package generic;

import java.util.ArrayList;

public class GenericTest {
	public void methodOne(ArrayList<String> l){
		
	}
	public void methodTwo(ArrayList<Integer> l){
		
	}
	public static void main(String[] args) {
    Cat c=new Cat();
    c.m1(10);
    c.m1("name");
    c.m2(10.50);
   // c.m2("Subodh");
     ArrayList<Integer> al=new ArrayList<>();
     ArrayList<Float> al2=new ArrayList<>();
     ArrayList<Double> al3=new ArrayList<>();
     ArrayList<String> al4=new ArrayList<>();
     c.m4(al3);
     c.m4(al2);
     c.m4(al);
    // c.m3(al);
     c.m3(al4);
    // E<B> e=new E<>();
     //E<X> e1=new E<>();
     E<F> e2=new E<>();
    // E<Object> e=new E<>();
    // G<X> g1= new G<>();
     //G<Q> g2= new G<>();
     G<H> g3= new G<>();
     
	}

}
