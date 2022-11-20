package Encapsulation;

/**
 * compile-time polymorphism or early binding. eg: Method overloading
 * 
 * rules of method overloading. 1:Method name must be same 2:Method argument
 * list must be different 2.1 difference in terms of argument type 2.2
 * difference in terms of number of arguments. 2.3 difference in terms of
 * position(order) of arguments.
 * 
 * 3: No restriction on return type and modifiers(access or non-access)
 * 
 *
 */
public class MethodOveriding {
	public void m1() {

	}

	public void m1(int a) {

	}

	public int m1(int a, int b) {
		return 0;

	}

	private void m1(long l) {

	}

	private void m1(int a, long b) {

	}

	public void m1(long a, int b) {

	}
}
