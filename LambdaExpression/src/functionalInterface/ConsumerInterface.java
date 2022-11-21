package functionalInterface;

import java.util.function.Consumer;

public class ConsumerInterface {
       
	/**
	 * consumer interface have one method-> get();
	 
	 *   It take one argument or one parameter.
	  
	 *  it doesnt return any value.
	
	 *  It do some action and print the value.
	 */
	public static void main(String[] args) {
	
		//
	Consumer<Integer> sd=e->System.out.println(e*e);
	sd.accept(6);
	 //
	Consumer <String> st=e->System.out.println(e);
	 st.accept("Lakhan Singh");
	   
	 // Consumer Chaninng 
	 
	 Consumer <String> s=e->System.out.print(e+"our mother ");
	 Consumer <String> s1=e->System.out.print(e+ " have four legs,");
	 Consumer<String> s2=e->System.out.print(e+ " have 2 eyes,");
	 Consumer <String> s3=e->System.out.print(e+" have two ear");
	 Consumer <String> s4=e->System.out.print(" *COW*");
	 //  1st way
	// s.accept("");
//	 s1.accept("");
//	 s2.accept("");
//	 s3.accept("");
//	 s4.accept("");
	 
	  //2nd way
	
	 s.andThen(s1).andThen(s2).andThen(s3).andThen(s4).accept("cow");
	 
	 //3rd way
	 
	 Consumer<String> s5=e->s.andThen(s1).andThen(s2).andThen(s3).andThen(s4);
	
	 s5.accept("cow");
	}
}