package generic;

import java.util.ArrayList;
import java.util.List;

public class Cat {

	public <T>void m1(T t) {         // generic method
		System.out.println("m1");
	}
	public <T extends Number>void m2(T t) {         // generic method
		System.out.println("m2");
	}
	
	public void m3(List<String> l) {        //normal method
		System.out.println("m3");
		//l.add(10);
		l.add(null);
		l.add("subodh");
		
	}
	
	public void m4(ArrayList<?> al) {         // generic method it is valid only for read operation we cannot add and modify.
		System.out.println("m4");
		//al.add(10);
		al.add(null);
		//al.add("subodh");
	}
	
	
}
