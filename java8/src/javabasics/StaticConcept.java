package javabasics;

public class StaticConcept {
static String name="xyz";
static int age=32;
static String gender="male";
static long rollNumber=33;
public static void main(String[] args) {
//	StaticConcept sc=new StaticConcept();
	System.out.println(StaticConcept.name);
	System.out.println(StaticConcept.age);
	System.out.println(StaticConcept.gender);
	System.out.println(StaticConcept.rollNumber);
}
}
