package Array;

public class ArrayDemo {

	public static void main(String[] args) {
		// Array declration
		int[] a = null;
		byte[] b;
		double[] d;

		// Creating object of an Array
		float[] f = new float[5];
		// accessing element from the array.
		// System.out.println(f[3]);
		// System.out.println(f[1]);
		// Update elements of an array from another value.
		f[2] = 30;
		f[0] = 20;
		f[1] = 10;
		for (int i = 0; i < 5; i++)
			System.out.println(f[i]);
		System.out.println("**");
		// enhance for loop.
		for (float f1 : f) {
			System.out.println(f1);
		}
		System.out.println(a);

		// create a string array of size 5 and initialize with your 5 friends name and
		// access all the name using enhance
		String[] s = new String[5];
		s[4] = "mahi";
		s[1] = "Raghu";
		s[2] = "Akshat";
		s[3] = "Amit";
		s[4] = "Rishab";
		for (String s1 : s) {
			System.out.println(s1);
		}

	}

}
