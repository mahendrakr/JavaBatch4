package javabasics;

final public class Test {
//instance variable or non-static variable
	int a=20;
	
//static variable or class variable or global variable
	static int b=10;
	public static void main(String[] args) {
		System.out.println(Test.b);
		System.out.println(b);
		Test test=new Test();
		System.out.println(test.b); //not recommended
		
		
	}
}
