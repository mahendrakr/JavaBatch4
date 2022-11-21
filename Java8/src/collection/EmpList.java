package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpList {

	 

	

	public static void main(String[] args) {
		
		 List<Employee> li=new ArrayList <>();
		 li.add(new Employee("mahesh" , 30040 , 3));
		 li.add(new Employee("ravi" , 30000 , 2));
		 li.add(new Employee("kartikey" , 15000,1));
		 li.add(new Employee("sachin" , 40000 , 4));
		 
		 li.forEach(System.out::println);
		
	}
}
