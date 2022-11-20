package controlflow;
/*
 * 
 */

public class SelectionStatement {
public static void main(String[] args) {
	int a=10;
	int b=20;
	if(a>b) {
		
		System.out.println(true);
		
	}
	else {
		System.out.println(false);
	}
	if(a<b) {
    System.out.println(a++);
	System.out.println(a);
	}
	else
    a++;
	System.out.println(a);

	if(++a<b);
	else
		a++;
	a++;
	System.out.println(a);
	
	
	
}


}
