package Inheritance;
/**
 * 1.Static things get memory first.(at the class loading time)
 * 2.static variable or static block (execution order first come first serve )
 * 3.instance things get memory at the time of object creation.
 * 4.instance variable or instance block (execution order first come first serve)
 * 5.then constructor
 * @author akshat
 *
 */

public class ExecutionOrder extends Parent1 {
	static {
		System.out.println("static block 1");
	}
	{
		System.out.println("instance block 2");
	}
	int a = m3();
	int b;
	static int c = m1();
	static int d;
	{
		System.out.println(b);
		System.out.println("instance block 1");
	}
	

	
	static {
		System.out.println("static block 2");
	}

	ExecutionOrder() {
		System.out.println("constructor");
	}

	public static int m1() {
		System.out.println("m1()");
		return 10;
	}

	public static void m2() {
		System.out.println("m2()");

	}

	public int m3() {
		System.out.println("m3()");
		return 30;
	}

	public void m4() {

		System.out.println("m4()");
	}
	public static void main(String[] args) {
		ExecutionOrder exu=new ExecutionOrder();
		
		
	}
}
