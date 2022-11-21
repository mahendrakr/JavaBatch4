package functionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterfac {

	    /**
	     * It cantains 2 argument(  <T , R>  1.- Type of parameter    2.- return type).
	     * It have one abstract method -> apply();
	     
	     use-:> when we want to return some value then we use predefined function interface.
	      
	      
	     */
	
	public static void main(String[] args) {
		
    //
		
	Function<Integer , Integer> f=e->e*e*e;
	Function<Integer , Integer> f2=e->e+e;
	System.out.println(f.apply(3));
	System.out.println(f.apply(5));
	
	
	//
	Function<String , Integer> fe=e->e.length();
	System.out.println(fe.apply("Ram Shyam"));
	
	/**
	 * To performing two or more methods we have two methods
	 *   1.-> andThen
	 *   2.-> compose
	 */
	System.out.println(f.andThen(f2).apply(5));
	System.out.println(f2.compose(f).apply(5));
	
	
	 
//	Function<Integer,Integer> f1=e->{
//			      if(e>23)
//			    	  return e/100;
//			       };
//	
//	 f1.apply(24);
	
	
	
	}
	
} 
