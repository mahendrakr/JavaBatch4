package operator;

public class TernaryOperator {
	public static void main(String[] args) {
		String s=10>5?"true":"false";
		System.out.println(s);
		boolean b =20>30?true:false;
		System.out.println(b);
		String str=9>5?(9%2==0?"even":"odd"):"false";
		System.out.println(str);
		String s1= 9%2==0?"even":"odd";
		System.out.println(s1);
		System.out.println(10%3);
	}

}
