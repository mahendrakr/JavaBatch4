package Inheritance;
@FunctionalInterface
public interface MyInterface {

	int a=10;
 public abstract void m1();
   
 public default void m2() {
    	System.out.println("m2");
    };
	public static void m3() {
		System.out.println("m3");
	};
	//public abstract void m4();
}
