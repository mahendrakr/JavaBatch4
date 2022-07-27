package Inheritance;
/**
 * 
 * 
 * @author HRISHABH SINGH BAGARI
 *
 */

public class Parent1 {
	static {
		System.out.println("Parent static block 1");
	}
	{
		System.out.println("Parent instance block 2");
	}
	int a = m5();
	int b;
	static int c = m7();
	static int d;
	{
		System.out.println(b);
		System.out.println("Parent instance block 1");
	}

	static {
		System.out.println("Parent static block 2");
	}

	public static int m7() {
		System.out.println("Parent M7");
		return 10;
	}

	public static void m8() {
		System.out.println("Parent m8");
	}
	public int m5() {
		System.out.println("Parent m5");
		return 30;
	}

	public void m6() {

		System.out.println("Parent m6");
	}
	
}
