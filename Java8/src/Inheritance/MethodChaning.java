package Inheritance;

public class MethodChaning {

	public void m1() {
		System.out.println("m1");
		this.m2();
	};
	public void m2() {
		System.out.println("m2");
		this.m3();
	};
	public void m3() {
		System.out.println("m3");
		this.m1();   
	};
	public static void main(String[] args) {
		MethodChaning m=new MethodChaning();
		m.m1();
	}
	
}
