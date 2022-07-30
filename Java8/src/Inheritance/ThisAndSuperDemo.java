package Inheritance;

/**
 * This And Super: you can not access from static context (static block or
 * static method).
 * 
 * 
 *
 */
public class ThisAndSuperDemo extends MyParent {
	int a;
	int b;
	int c;

	ThisAndSuperDemo(int a, int b) {
		super(100);
		this.a = a;
		this.b = b;
		this.c = a;
		super.a = 120;
	};

	public void m1(int a) {
		System.out.println(super.a);
	};

	public static void main(String[] args) {
		ThisAndSuperDemo tad = new ThisAndSuperDemo(10, 20);
		System.out.println(tad.a);
		System.out.println(tad.b);
		System.out.println(tad.c);
//	    System.out.println(this.a);
		tad.m1(40);
	}

}
