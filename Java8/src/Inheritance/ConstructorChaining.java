package Inheritance;

public class ConstructorChaining {

	ConstructorChaining() {
		this(20);
		System.out.println("NO argument");
		
	};

	ConstructorChaining(int a) {
		this(30,40);
		System.out.println("One argument");
	};

	ConstructorChaining(int a, int b) {
		//this();
		System.out.println("two argument");
		
	}
	public static void main(String[] args) {
		ConstructorChaining cc=new ConstructorChaining();
		
	}
}
