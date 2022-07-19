package SundayClass;

public class MethodOverloading {

	public void m1(String s) 
	{
		System.out.println("string");
	}
	
	public void m1(int[] arr) {
		System.out.println("arr");
	}
	public void m1(Object obj) {
		System.out.println("object");
		
	}
	public static void main(String[] args) {
		MethodOverloading mov=new MethodOverloading();
    	mov.m1("rishabh");                 
		int[] arr = new int [2];
		mov.m1(arr);
		String[] arr1= new String [2];
		mov.m1(arr1);
	}
}

