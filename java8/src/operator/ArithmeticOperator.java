package operator;
/**
 * Note = 0.0/0
 *        0/0.0
 *        0.0/0.0 in all these three cases you will get NaN(not a number).
 * @author Hp
 *
 */
public class ArithmeticOperator {

	public static void main(String[] args) {
		//System.out.println(0/0);
		//System.out.println(10/0);
        System.out.println(10/0.0);
        System.out.println(10.0/0);
        
        System.out.println(0.0/0);
        System.out.println(0/0.0);
        System.out.println(0.0/0.0);
	}

}
