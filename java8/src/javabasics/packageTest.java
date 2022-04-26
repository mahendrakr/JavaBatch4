package javabasics;

public class packageTest {
	public static void main(String[] args) {
		pack2.Student stu2=new pack2.Student();
		stu2.printName();
		pack1.Student stu1=new pack1.Student();
		int age=stu1.getAge();
		System.out.println(age);
		System.out.println(stu1.getAge());
		Student1 stu=new Student1();
		javabasics.Student1 s=new javabasics.Student1();// Not Recommended if you are in the same package.
		pack2.Cat cat=new pack2.Cat();
		
	}
	
	

}
