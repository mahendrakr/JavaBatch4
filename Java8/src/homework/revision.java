package homework;

import java.util.*;

public class revision {
	public static void main(String[] args) {
		int[] P = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st week marks");
		P[0] = sc.nextInt();
//		
		System.out.println("enter 2nt week marks");
		P[1] = sc.nextInt();
//		if (P[1] >= 9) {
//			P[1] = 1;
//		} else
//			P[1] = 0;
		System.out.println("enter 3rd week marks");
		P[2] = sc.nextInt();
//		if (P[2] >= 9) {
//			P[2] = 1;
//		} else
//			P[2] = 0;
		System.out.println("enter 4th week marks");
		P[3] = sc.nextInt();
//		if (P[3] >= 9) {
//			P[3] = 1;
//		} else
//			P[3] = 0;
		for(int i=0; i<=3; i++) {
			if(P[i]<=10){
				P[i]=0;}
				else
				P[i]=1;
			
		}

		System.out.println(P[0]+P[1]+P[2]+P[3]);

	}
}
