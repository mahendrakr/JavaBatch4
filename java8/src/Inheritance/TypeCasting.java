package Inheritance;
/**TypeCasting ---> Rules 1: compile time checking 
 *         A b=(C)d ..here A and C are class or interface 
 *         C must be either same type or derived type (child) of A.
 *  
 *  Rule 2:Type of d and C must have some relationship (child--> parent, parent--> child or same).
 *   eg: A a=(B)d
 * 
 * ## Run-time checking.
 *  A b=(C)d 
 *  here d must be either same or child type of C.
 * 
 *
 */
public class TypeCasting {
   
	public static void main(String[] args) {
		 A a=new B();
		 
		// a.m3();
		 B b=(B) a;
		 b.m3();
		// Parent p=(Parent)a;
		 Object a1=new F();
		 A b1=(B)a1;
		 
		 
		 
  
	}

}
