package operator;
/**
 * Preincrement(++x)---> means increase first then put the value.
 * Postincrement(x++)= means put the value first then increase the value.
 * @author Hp
 *
 */
public class IncrementOperator {
	 public static void main(String[] args) {
		int a=10;
		++a;
		//System.out.println(a);
		int b=10;
		b++;
		//System.out.println(b);
		int x=10;
		System.out.println(x++);
		int y =10;
		System.out.println(++y);
		int z=20;
		System.out.println(z++ + z + z++ -z++ + ++z);
		System.out.println(--z + z++ + --z + z++ + z + z++);
		System.out.println(z);
		
	}

}
