package Encapsulation;
/**Rules for method selection by compiler.
 * 1: Exact match 
 * 2: Nearest widening(btye>short>int>long>float>double.)
 * 3: Autoboxing(changing from primitive to wrapper)
 *    AutoUnboxing(changing from wrapper to primitive)
 *  4:Varargs(Variable argument
 * 
 *
 */
public class MethodSelection {
	//public void m1(int a) {
		//System.out.println("int");
		
	//}
	//public void m1(long l) {
		//System.out.println("long");
//	}
	//public void m1(Integer i) {
		//System.out.println("Integer");
//	}
	public void m1(int ...args) {
		System.out.println("args");
	}
	//public void m1(float f) {
		//System.out.println("float");
//	}
	public void m1(Long l1) {
		System.out.println("Long");v
	}
	

	public static void main(String[] args) {
		MethodSelection ms=new MethodSelection();
		ms.m1(10,20,30,40,50);
		
		
     
	}
	

}
