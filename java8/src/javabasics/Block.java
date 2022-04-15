package javabasics;
/**
 * You cannot access instance variable , method from static context.
 * But you can access static variable from instance context.
 * 
 * @author akjai
 *
 */
public class Block {
	int a;
	static int b;
	
	
	{
		System.out.println(b);
		System.out.println("instance Block"); //instance block
		
	}
	
	static{
//		System.out.println(a);
		System.out.println("static Block"); 
	} 
	
	
}
