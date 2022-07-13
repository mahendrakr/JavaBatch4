package hrishabh;

/**
 * properties of a student name- yug singh roll no.-123 age-18 branch-CS
 * section-a college-TIT phone no.-7566745729 is married?- no
 * 
 * behaviors of a student. read , write,speak,dance,eat,etc.
 * 
 * @author HRISHAV KUMAR BAGARI
 * 
 *         any fool can write code which machine can understand good programmer
 *         writes code which human can understand
 */
public class Student {
	String name= "Yug singh";
	int rollNumber = 123;
	int age = 18;
	String branch = "CS";
	char section = 'A';
	String college = "TIT"; 
	long phoneNumber = 7566745729L;
	boolean isMarried = false;

	void write() {
		System.out.println("Student can write ");
	}

	void read() {
		System.out.println("Student can read");
	}

	void eat() {
		System.out.println("Student can eat");
	}

	
	void dance() {
		System.out.println("Student can dance");
	}

	void speak() {
		System.out.println("Student can speak");
	}
	public static void main(String[] args) {
//		creat an object 
		Student st=new Student();
		System.out.println(st.name);
		System.out.println(st.rollNumber);
		System.out.println(st.age);
		System.out.println(st.branch);
		System.out.println(st.section);
		System.out.println(st.college);
		System.out.println(st.phoneNumber);
		System.out.println(st.isMarried);
//		String name = st.name;
//		System.out.println(name);
//		System.out.println(st.write());
		st.write();
		st.read();
		st.speak();
		st.dance();
		st.eat();
	}

}
