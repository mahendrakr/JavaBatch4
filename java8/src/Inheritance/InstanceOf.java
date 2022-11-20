package Inheritance;
/**
 * 
 * 
 *
 */
public class InstanceOf {

	public static void main(String[] args) {
    Parent c=new Child1();
    Parent p=new Parent();
    if(p instanceof Parent) {
    	System.out.println("True");
    }
    else
    	System.out.println("false");
	}

}
