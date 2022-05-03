package operator;
// ~ 
/**
 * step :1 convert 0 To 1 and 1 to 0 of given integral number (tild operator is applicable on 
 * ly on integral no.)
 * step:2 If leftmost significant bit is 1 means number is negative and computer store negative numbers in the form of 2's compliment.
 * eg: 8 convert into binary 1000.(assumpution assume size of a integer is 1 byte.)
 *     00001000 
 *  apply step 1 => 11110111
 *  apply step 2=>  1's compliment of 11110111 is 00001000 
 *  2's compliment => 00001000+ 1 =00001001 = -9.
 * 
 * 
 *
 */
public class TildOperator {

	public static void main(String[] args) {
     System.out.println(~8);
     System.out.println(~-9);
     System.out.println(~10);
     int a= 150;
     byte b=(byte)a;
     System.out.println(b);
     
	}
	
	}


