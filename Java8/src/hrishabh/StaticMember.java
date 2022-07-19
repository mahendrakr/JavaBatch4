package hrishabh;

import java.io.PrintStream;

/**
 * static variable - just put static keyword in front of instance variable
 * 
 * purpose of static variable-
 * to share common things across the objects.
 * access static variable-
 * you can access static variable with the help of class name.
 * example-StaticMember.name
 * note-you can also access static variable using object. (but not recommanded)
 * @author HRISHAV KUMAR BAGARI
 *
 */
public class StaticMember {
	static String name = "Yug singh";
	static int rollNumber = 123;
	static int age = 18;
	static String branch = "CS";
	static char section = 'A';
	static	String college = "TIT";
	static long phoneNumber = 7566745729L;
	static boolean isMarried = false;
	static void m1() {System.out.println("static method m1");}
	
	public static void main(String[] args) {
		System.out.println(StaticMember.name);
		System.out.println(StaticMember.rollNumber);
		System.out.println(StaticMember.age);
		System.out.println(StaticMember.branch);
		System.out.println(StaticMember.section);
		System.out.println(StaticMember.college);
		System.out.println(StaticMember.phoneNumber);
		System.out.println(StaticMember.isMarried);
		System.out.println(name); //limited to current class StaticMember
//		m1();
//		PrintStream out = System.out;
//		out.println("Hello system");
//		System.out.println("by system");
	}
}
