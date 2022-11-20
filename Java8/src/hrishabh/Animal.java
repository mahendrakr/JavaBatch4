package hrishabh;

/**
 * 
 *properties of an animals-
 *
 *legs-
 *eyes-
 *nose-
 *tail-
 *horn-
 *body shap-
 *
 * behaviour of an animals-
 * eating food, walk, 
 * 
 * 
 * @author HRISHAV KUMAR BAGARI
 *
 */

public class Animal {
	static	int legs=4;
	static int eyes=2;
	static	int noese=1;
	static	int tail=1;
	static	String horn="horrible";
	static	String bodyShape="animal type";
	
	static void m1() {System.out.println();}
           
	void eating () {
		System.out.println("tiger can eating");
		}
	void food () 
	{
		System.out.println("meat");
		}
	void walk()
	{
		System.out.println("tiger can walk with the help of his four legs");
	}
	public static void main(String[] args) {
		System.out.println(Animal.legs);
		System.out.println(Animal.eyes);
		System.out.println(Animal.noese);
		System.out.println(Animal.tail);
		System.out.println(Animal.horn);
		System.out.println(Animal.bodyShape);
	}
	
}
