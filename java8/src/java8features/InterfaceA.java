package java8features;
@FunctionalInterface
public interface InterfaceA {
	
   // void run();
	public abstract void eat();
	public static void m1() {}
	public default void m2() {
		System.out.println("InterfaceA m2");
	}
	public default String toString1() {
		return"Naysha";
	}
	public default boolean equals1(Object obj) {
        return true;
        }
	public static String toString2() {
		return"Naysha";
	}
}
