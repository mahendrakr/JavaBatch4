package exceptionhandling;

public class Main {

	public static void main(String[] args) throws CustomException {

		Student stu = new Student();
		stu.setName("Hrishabh");
		stu.setBtechpercentage(61);
		stu.setTwelthPercentage(59);
		stu.setTenthPercentage(90);
		Elegebility ele = new Elegebility();
//		try {
//			ele.isElegeble(stu);
//		} catch (MyException e) {
//			System.out.println(e.getMessage());
//		}
		ele.isElegeble(stu);
	}
}
