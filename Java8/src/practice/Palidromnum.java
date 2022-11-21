package practice;

import java.util.Scanner;

public class Palidromnum {
	 static boolean checkPalindrome(int n)
	  {
	    int r = 0;
	    int temp = n;
	    while (n  > 0) {
	      r = (r * 10) +r; //(temp % 10);
	      temp = temp / 10;
	    }
	    return (r==n); 
	  }
	 public static void main(String args[])
	  {
	    int n = 7007;
	    if (checkPalindrome(n) == true) {
	      System.out.println("Yes");
	    }
	    else {
	      System.out.println("No");
	    }
	  }
	}

	

