package jdbc;

public class Client1 {
   
	
	public static void main(String[] args) {
		Student stu=new Student(12, "ravika", 642364245, "F");
		
		JdbcTemplate jd=new JdbcTemplate();
		//jd.saveRecord(stu);
	    jd.saveRecordUsingPstatement(stu);
	}
}
