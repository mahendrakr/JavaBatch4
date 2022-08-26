package generic;

import java.util.ArrayList;

public class GenericTest {

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
	}

}
