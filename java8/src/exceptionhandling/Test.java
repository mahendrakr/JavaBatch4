package exceptionhandling;

public class Test {

	public static void main(String[] args) {
		try {
			  System.out.println(10/0);
		}
	catch(Exception e) {
  // e.printStackTrace();
		System.out.println(e.getMessage());	
		}
		 System.out.println("subodh");

}
}
