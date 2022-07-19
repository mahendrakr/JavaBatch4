package Inheritance;

public class Child1 extends Parent{
	String name = "child1";
	String parentName = getParent();
	
	public static void main(String[] args) {
		
		Child1 ch=new Child1();
		System.out.println(ch.parentName);
		ch.getParent();
//		System.out.println(ch.x);
	}
}
