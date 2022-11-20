package operator;
//&--> bitwise (check both condition) can only apply on boolean and integral.
//&& ---> and  shortcircuit operator 
// | -->or (bitwise)
public class BitwiseOperator {

	public static void main(String[] args) {
		int x=10;
    if (x++ > 5 && 10 < ++x) {
    	System.out.println("inside if block");
    	System.out.println(x);
    }
    else {
    	System.out.println("inside else block");
    	System.out.println(x);//12
    }
    System.out.println(4 & 5);
    System.out.println(4 | 5);//5
    System.out.println(4 ^ 5);//1
    System.out.println(3 ^ 4);//7
    System.out.println(8 & 9);//8
//   System.out.println(10.5 & 10.6);
	}

}
