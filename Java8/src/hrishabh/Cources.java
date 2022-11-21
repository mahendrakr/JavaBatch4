package hrishabh;
/**
 *  containing four integers A,B,X and Y the distances of Al

ice's and Bob's home from their offices 
 and the times taken by them to reach there respectively.
 
 20 6 20 5
10 3 20 6
9 1 1 1
 */

import java.util.*;
public class Cources {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
 	int T=sc.nextInt();
	while(T-->=1) {		
		int X=sc.nextInt();
		int Y=X/3;
		if(X%3==0) {
			System.out.println(0);
//			break;
		}
		else{
	    int	A=Y+1;
   	int	B=A*3;
   	int n=B-X;
		System.out.println(n);

}}
}
	}