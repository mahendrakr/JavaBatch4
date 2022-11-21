package functionalInterface;

import java.util.function.Predicate;

/**
 * We can join join multiple pedicates by using these three methods.
 * Joining Predicate:-> 1.and()
 *                      2. or()
 *                      3.negate()
 * @author HRISHAV KUMAR BAGARI
 *
 */
public class JoiningPredicate {
	
	static int []x= {32,4645,75857,678764,74,4522,325,45,66666};
	
	public static void main(String[] args) {
	    
		//and()
 
	 Predicate<Integer> pr=i->(i%2==0);    //even number
	 Predicate<Integer> pr1=i->(i>65);     // gretten then 65
	 Predicate<Integer> pr3=i->(i<100000); // less then 1000000
	
//	 for(int e:x) {
//		 if(pr.and(pr1).test(e)) {		
//			 System.out.println(e); 
//		 }
//	 }
	 
	 //or()
	 
	for(int f:x) {
		if(pr.and(pr1).and(pr3).test(f)) {
			System.out.println(f);
		}
	}
	
	//negate()    it mean opposite .
	              //here our condition is regarding to even numbers but it gives us odd numbers.
      
	for(int g:x) {
		if(pr.negate().test(g)) {
			System.out.println(g);
		}
	}
//	4645
//	75857
//	325
//	45
	
}
}
