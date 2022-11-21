package java8features;

public class A  implements InterfaceA{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public  void m2() {
		System.out.println("ClassA m2");
	}
	public static void main(String[] args) {
		InterfaceA a=new A();
		a.m2();
	}

}
