package Encapsulation;
/*
 * 
 */
public class Student {

   private int sid=101;
	private String name="subodh";
	private int age=10;
	
	public int getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setName(String name) {
		if (!name.equals("subodh"))
			return;
		this.name = name;
	}
	public void setAge(int age) {
		if (age<0)
			return;
		
		this.age = age;
	}
	
	
	

}
