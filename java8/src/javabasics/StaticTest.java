package javabasics;
// Explain System.out.println() ?
import java.io.PrintStream;

public class StaticTest {
public static void main(String[] args) {
	System.out.println(StaticConcept.age);
	System.out.println(StaticConcept.name);
	System.out.println(StaticConcept.rollNumber);
	PrintStream out = System.out;
	out.println("hello");
}
}
