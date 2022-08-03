package exceptionhandling;

public class Test {

	public static void main(String[] args) {
		int a = 10;
		try {
			a++;
			// System.out.println(10 / 0);
			System.out.println("rishabh");
			System.exit(0);
			a++;

		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
			a++;
		} finally {
			a++;
			System.out.println("finally block");
		}
		System.out.println(a);

	}
}
