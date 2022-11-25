package functionalInterface;

import java.util.function.Predicate;

public class PredicateInter {
              
	/**
	 * it is a predefined functional interface. which contains single abstract
	 * method 'test' and return type is boolean . 
	 * its take  only one argument.
	 * 
	  use--> if we have conditional checks .
	 */
	public static void main(String[] args) {
		
		//
		Predicate <Integer> p=x->(x>10);
		
		System.out.println(p.test(4));  //false
		System.out.println(p.test(11)); //true 
		
		
		Predicate<String> p1=(y)-> (y.length()==18);
		System.out.println(p1.test("Hrishabhkumarbagri"));   //true
		
		//
		int[] values={10,20,30,40,50,60,70,80,90,100};
		
		for(int i:values) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	   String[] names= {"abc", "def" , "ghi", "jkl","mno","pqr"};
	   Predicate<String> pr=(u)->(u.length()>2);
	   for(String s:names) {
		   if(pr.test(s)) {
			   System.out.println(s);
		   }
	   }
		 
	 
	}
	  
	
}
