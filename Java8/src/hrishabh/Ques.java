package hrishabh;

import java.util.Scanner;

/**
 * there is a construction company  and in that construction company 
 * 
 *
 */
public class Ques {
 public static void main(String[] args) {
	

	Scanner sc=new  Scanner(System.in);
	int T=sc.nextInt();
    while(T-->0) {
        int X=sc.nextInt();
        int P=sc.nextInt();
        int Q=sc.nextInt();
        int wt=P-Q;
        System.out.println(wt*X);
    }
}
}