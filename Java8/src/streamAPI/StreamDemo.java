package streamAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
     
	 public static void main(String[] args) {
		List <Student> li=new ArrayList<>();
		li.add(new Student(1, "Aman", "Bhopal",450, "Male"));
		li.add(new Student(2, "Bhaskar", "Indore",480, "Male"));
		li.add(new Student(3, "cinu", "Bhopal",350, "Male"));
		li.add(new Student(4, "Deepak", "Patna",370, "Male"));
		li.add(new Student(5, "Emly", "Bhopal",250, "Female"));
		li.add(new Student(6, "Golu", "Patna",490, "Male"));
		li.add(new Student(7, "Dipali", "Satna",499, "Female"));
		
		List <Student> list=new ArrayList<>();
		
		for(Student s:li) {
		  if(s.getCity().equals("Patna"))	{
			  list.add(s);
		  }
		}
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getCity()+" "+s.getMarks()+" "+s.getGender());
		}
		System.out.println("********************************************");
		//Predicate<? super T> predicate
//		Predicate<Student> p = (st)->{
//			   return st.getCity().equals("Patna");
//		};
		
//		List<Student> collect = li.stream().filter(st->st.getCity().equals("Patna")).collect(Collectors.toList());
//		collect.forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getCity()+" "+s.getMarks()+" "+s.getGender()));
//	    li.stream().filter(st->st.getCity().equals("Patna")).collect(Collectors.toList()).forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getCity()+" "+s.getMarks()+" "+s.getGender()));
	 /*
	  * Q.1->  fetch all students whose marks is >= 450 .
	  * Q.2->  Fetch all female Students.
	  * Q.3->  fetch all female Students whose marks is > 450 .
	  */
		
//		li.stream().filter(st->st.getMarks()>=450).collect(Collectors.toList()).forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getCity()+" "+s.getMarks()+" "+s.getGender()));
//		System.out.println("*********************************");
//		li.stream().filter(st->st.getGender().equals("Female")).collect(Collectors.toList()).forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getCity()+" "+s.getMarks()+" "+s.getGender()));
//		System.out.println("*********************************");
//	    li.stream().filter(st->st.getGender().equals("Female")&& st.getMarks()>450 ).collect(Collectors.toList()).forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getCity()+" "+s.getMarks()+" "+s.getGender()));
//	    li.stream().map(Student::getName).collect(Collectors.toList()).forEach(System.out::println);
		li.stream().map(Student::getName).collect(Collectors.toList()).forEach(s->System.out.println(s));
	 }
}
