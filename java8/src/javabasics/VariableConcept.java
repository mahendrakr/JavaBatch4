package javabasics;
/**
 *Variables
 *1.Instance variable or Non-static variable
 *2.Static Variable
 *use of instance variable-'state is vary object to object 
 *use of Static variable-'state is common for all object 
 *to access instance variable you must create an object 
 *to access static variable object is not required , you can access with the class name  
 * @author akjai
 *
 */
public class VariableConcept {
int age=20;
static int collegeCode=104;

public static void main(String[] args) {
	VariableConcept vc=new VariableConcept();
	System.out.println(vc.age);
	System.out.println(VariableConcept.collegeCode);
	System.out.println(vc.collegeCode); //not recommended
	System.out.println(collegeCode);//valid within a class
	
}
}
