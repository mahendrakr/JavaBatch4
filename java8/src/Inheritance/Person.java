package Inheritance;

 public class Person {

 public void m1() {
	 System.out.println("m1");
	 this.m2();
 }
 public void m2() {
	 System.out.println("m2");
 }
 public void m3() {
	 System.out.println("m3");
	 m1();
	 
 }

}

class Student extends Person{
	 
	 public void m2() {
		 System.out.println("child m2");
	 }
}
 
