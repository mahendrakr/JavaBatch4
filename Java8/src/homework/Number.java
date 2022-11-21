package homework;

/**
 * 
 * 
 */
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 1; i <= N; i++) {
			System.out.println(arr[N-1]);
		}
		for (int j = 0; j <= N - 1; j++) {
			
		String next = sc.next();
		System.out.println(next);
		int a=15;
		int b=5;
		int r = Math.min(a, b);
	//	System.out.println(r);
		while(r>0) {
			if(a%r==0 && b%r==0) {
				break;
			}
			r--;
		}
		System.out.println(r);
	}

	}
}

