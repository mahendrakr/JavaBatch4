package Bitmanupulation;

public class Q1 {
	
	public static boolean isEven(int a) {
		// in bitwise  & operater if you get nonzero means odd otherwise even.
		return (a & 1)==0? true : false ;
	}
  public static void main(String[] args) {
	  System.out.println(Q1.isEven(5));
  }
}
