package stringapi;
/*
 *1. what is an immutability explain with example?
 *ans--> once an object is initialized you cannot change it's state(value) further.
 *eg: String and all wrapper classes are immutable.
 *2  How can you make a class immutable?
 *3. Advantage of immutability..
 *
 *4. what is a string constant pool? 
 *ans--> It is special memory area for string.
 *      scp doesnot allow duplicate object/elements.
 *      advantage; To utlize memory efficiently.
 *      String is immutable object in java, resovle data inconsistency.
 *     
 *  
 *5. Reverse a word (Hello) in a string.
 *o/p: olleH
 *6. Reverse a sentence 
 *for eg: My name is khan.
 *o/p: khan is name My.
 *7. REverse a word of given sentence.
 *for eg: My name is khan.
 *o/p : My eman is khan
 * String constant pool --->i> utilize memory efficiently.
 * Q.___  diff. between String, StringBuffer and StringBuilder.
 * Ans.-- 1-> String overrides equals method but Stringbuilder and Stringbuffer dont override equals method.
 *        2-> String is immutable but stringbuilder and stringbuffer are mutable .
 *        3-> String and stringbuffer are thread-safe but stringbuilder is not thread-safe.
 *        4-> Stringbuilder performance is better then string and stringbuffer.
 *        
 * Q.____ explain contract of hashCode and equals method.
 * Ans--  suppose two objects obj1 and obj2 equals method return true then it is guarantee that hashCode of both the objects must be same but vice versa not true.
 */                         
public class StringDemo {

	public static void main(String[] args) {
   String s1= new String("Hello");  //It will create two objects in heap and scp(String constant pool) and it will refer to heap memmory. 
   String s2="Hello"; // It will create an object in scp, if there is no existing object in Scp.
   String s3="Hello"; //It will create an object in scp, if there is no existing object in Scp.
   System.out.println(s1==s2); //(==) operators compare with address
   System.out.println(s2==s3);
   System.out.print(s1.hashCode() + " " + s3.hashCode());// will have different hashcode in output.
   System.out.println();
   
   System.out.print(s2.hashCode() + " " + s3.hashCode());
   System.out.println();
   System.out.println(s1.equals(s3));// and equals() methods compare with content.          
  
   String s4=new String("Subodh");
   String s5="hi" + s4 + "how are you";
   
   String s6="Akshat";
  // String s7=s6+"Hello";
   s6.concat("hello"); 
   System.out.println(s6);      
   
   
  

	}

}
