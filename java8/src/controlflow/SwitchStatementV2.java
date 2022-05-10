package controlflow;

import java.util.Scanner;

public class SwitchStatementV2 {

	public static void main(String[] args) {
    //To take value from the user 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your input");
		int input = sc.nextInt();
		switch(input) {
		case 1:{
			System.out.println("case 1");
			break;
			
		}
		
		case 2:{
			System.out.println("case 2");
			break;
			
		}
		
		case 3:{
			System.out.println("case 3");
			break;
			
		}
		
		case 4:{
			System.out.println("case 4");
			break;
			
		}
		default:
			System.out.println("default");
		}
		sc.close();
	}

}
