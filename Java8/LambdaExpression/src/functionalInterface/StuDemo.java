package functionalInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class StuDemo {

	public static void main(String[] args) {
		
		Predicate<Student> pr=e->(e.th10per>=75.00 && e.th12per>=75.00);
	 List <Student> ls=new LinkedList<>();
	 ls.add(new Student("abc" ,"0191EC201040",80.6 ,75.85));
	 ls.add(new Student("def" ,"0191ME201063",79.45,82.4));
	 ls.add(new Student("xyz" ,"0191CS201198",90.0 ,89.0));
	 ls.add(new Student("abd" ,"0191EC201240",69   ,93.66));
	 
	 for(Student stu:ls) {
		 
		 if(pr.test(stu)) {
			
			System.out.println( "Student details:" +stu.stuName+"  "+stu.enNo+"  "+stu.th10per+"  "+ stu.th12per); 
		 }
		 
	 }
		 
	 
	 
	}
}
