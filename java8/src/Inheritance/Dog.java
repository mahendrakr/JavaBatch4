package Inheritance;

public class Dog extends Animal {

	@Override
	public void m1() {
     System.out.println("dog m1");		
	}
	public static void main(String[] args) {
		Animal a=new Dog();
		
	}
	

}
