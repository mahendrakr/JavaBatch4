package controlflow;
//TODO enum is pending, will discuss in upcoming chap.
//ICEBASS IS ONLY APPLICABLE IN SWITCH(ICEBSS)
public class SwitchStatement {

	public static void main(String[] args) {
    int a=10;
    char c='a';
    byte b=30;
    short s=30;
    String s1="mango";
     final int i=30;
    
    switch(b) {
    case 20:{
    System.out.println("case 10");
    break;
    } 
   
    
    case i:{
    	System.out.println("case 20");
    	break;}
        default:
    	System.out.println("default");
    	//default :                           Not allowed two default statement.
        	//System.out.println("default");
    
    }
    
    
    
	}

}
