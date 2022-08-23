package stringapi;
/** 
 * Q: swap the given words without using third variable.
 *  eg: String name=" Subodh Kumar"
 *  output: Kumar Subodh.
 *  
 *  Q: int a=10;
 *     int b=20;
 *     then 
 *     o/p: a=20, b=10;
 *    without using third vaiable.
 */

public class SwitchString {
	
	public static String swapstring(String str1, String str2,int l) {
		  //  int i=str1.length();
		    str1 =str1.concat(str2);
		    str2=str1.substring(0,l);
		    str1=str1.substring(l);
		   
			return String.join(" ", str1, str2);
		
		    
	}
	public static String swapstring1(String str1, String str2) {
		  //  int i=str1.length();
		    str1 =str1.concat(str2);
		    str2=str1.substring(0,str1.length()-str2.length());
		    str1=str1.substring(str2.length());
		   
			return String.join(" ", str1, str2);
		
		    
	}
	
	
	public static void swapnumber(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		
	   System.out.println(a +" "+b); 
		
	}
	

	public static void main(String[] args) {
   // String name="Subodh Kumar";
    String str1="Subodh";
    String str2="Kumar";
    str1 =str1 + str2;
    str2=str1.substring(0,6);
    str1=str1.substring(6);
    //String str3="Subodh";
    //System.out.println(str3.substring(0,3));

  //  System.out.println(str1.concat(" ").concat(str2));
    
       
	   System.out.println(swapstring("Raj","Kumar",3));
	  //SwitchString.swapnumber(10, 20);
	   System.out.println(swapstring1("Raj","Kumar"));
    
    
    
	}

}
