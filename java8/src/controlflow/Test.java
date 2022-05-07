package controlflow;

public class Test {
public static void main(String[] args) {
	Student stu=new Student(70, 80, 90, 0);
	Eligibility eli=new Eligibility();
    boolean eligible = eli.isEligible(stu);
    System.out.println(eligible);
}
}
