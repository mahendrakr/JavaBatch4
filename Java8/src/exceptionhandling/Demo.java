package exceptionhandling;

public class Demo {

	public int m1() {
		int a = 10;
		try {
			a++;
			return a;
		} catch (Exception e) {
			return a;
		} finally {
			a++;
			return 40;
		}
		
	}

	public static void main(String[] args) {
		Demo de = new Demo();
		System.out.println(de.m1());
	}

}
