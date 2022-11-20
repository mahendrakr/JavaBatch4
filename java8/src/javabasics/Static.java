package javabasics;
/**
 * Difference between static and non-static variable
 * 1.static variable get memory at class loading time but non-static variable get memory when 
 * object is created. 
 * 2.static variable get memory only once but non-static variable get memory , how many times you 
 * create an object that many times.
 * 3.static variable consume less memory as compared to non-static variable
 * 4.you can use static variable when you feel state of an object is not changing
 *  frequently(for common things) and vice-versa
 *  you can invoke/call/access static variable without creating an object by using class name but
 *  to access non-static variable you must create an object 
 * NOTE: if you want to test, class is loaded or not then you can use static block .  
 * @author akjai
 *
 */
public class Static {
	static int count;
	public Static(){
		count=count+1;

		System.out.println(count);
		
		
	}
	
public static void main(String[] args) {
	Static s1=new Static();
	Static s2=new Static();
	Static s3=new Static();

}
}
