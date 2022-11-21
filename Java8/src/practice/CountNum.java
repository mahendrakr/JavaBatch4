package practice;

import java.util.Scanner;

public class CountNum {

	
    
	static int countDig(long n) {
		
		int coun = 0;

		while (n != 0) {
			n = n / 10;
			++coun;
		}

		return coun;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		System.out.println(countDig(n));
		
	}

}
