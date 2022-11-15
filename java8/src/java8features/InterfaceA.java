package java8features;
@FunctionalInterface
public interface InterfaceA {
	
   // void run();
	public abstract void eat();
	public static void m1() {}
	public default void m2() {}
}
