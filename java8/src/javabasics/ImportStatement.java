package javabasics;
//import pack1.Student;//Recommended
import pack1.University;//Recommended
import pack2.subpack1.Employee;
import pack1.College;//Recommended
import pack1.*; //valid but not recommended. Note= pack1.* will refer only those classes or interfaces or enum which are available in pack1 not in its
//subpackage.
import pack2.Student;
import static pack2.Student.m1;
import static java.lang.System.out;
public class ImportStatement {
 public static void main(String[] args) {
	pack2.Student stu2= new pack2.Student();
	//Student stu3 = new Student();
	College college=new College();
	University un = new University();
	Employee emp=new Employee();
	Student.m1();
	m1();
	out.println("Hello java");
}
}
