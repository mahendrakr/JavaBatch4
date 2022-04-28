package javabasics;

<<<<<<< HEAD:java8/src/javabasics/Student.java
public class Student {
   String name = "Hrishabh";
   String college = "Technocrats Iinstitute of Technology"; 
   String branch = "CSE"; 
=======
public class Student1 {
   String name = "Aditya";
   String college = "Oriental Institute of Science And Technology"; 
   String branch = "Cse"; 
>>>>>>> 8da397e8285d75b4703f6c3df8f2e309c3744513:java8/src/javabasics/Student1.java
   int age = 21;
   char gender ='M';
   double weight = 57;
   boolean isMarried = false;

   void reader() {
           System.out.println("fast");
   }

   void eat() {
           System.out.println("food"); 
   } 
   
   void language() {
           System.out.println("hindi , english");
   }

    public static void main (String[]args){
         // create an object 
         Student1 student = new Student1();
         //call a variable or a method
         System.out.println(student.name);
         System.out.println(student.college);
         System.out.println(student.branch);
         System.out.println(student.age);
         System.out.println(student.gender);
         System.out.println(student.weight);
         System.out.println(student.isMarried);
         student.reader();
         student.eat();
         student.language();

     }
}
          
    
        
   

