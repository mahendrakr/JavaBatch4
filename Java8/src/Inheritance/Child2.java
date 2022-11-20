package Inheritance;

public class Child2 extends Parent {
	String name = "child2";
	String parentName = getParent();
	
public static void main(String[] args) {
		
		Child2 ch=new Child2();
		System.out.println(ch.parentName);
}
}