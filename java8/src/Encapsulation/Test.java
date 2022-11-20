package Encapsulation;

public class Test {

	public static void main(String[] args) {
     Student s= new Student();
     System.out.println(s.getName());
     System.out.println(s.getSid());
  
     System.out.println(s.getAge());
     System.out.println("*******");
     
     s.setName("Aditya");
     s.setAge(-20);
     s.setSid(102);
     System.out.println(s.getName());
     System.out.println(s.getAge());
     System.out.println(s.getSid());

}

}
