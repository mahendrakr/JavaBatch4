package Inheritance;

public class Parent {

	 int x = 10;         //private
	 String name = "Ram singh";     //private

	public synchronized String getParent() {
		System.out.println("Parent m1");
		return name;
	};
	 Object m1(String name) {
		return name;
		
	}
	 public static void m2() {
		 System.out.println("parent m2");
	 }
	
  
}
