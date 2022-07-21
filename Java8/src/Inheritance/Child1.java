package Inheritance;

public class Child1 extends Parent{
	String name = "child1";
	String parentName = getParent();
	@Override
	protected final String m1(String name){
		System.out.println("child");
		return "subodh";
	}
	
	
	public static void main(String[] args) {
		
		Child1 ch=new Child1();
		System.out.println(ch.parentName);
		ch.getParent();
//		System.out.println(ch.x);
		Parent p=new Child1();
		System.out.println(p.m1("Akshat"));
	}
}
