package collection;

public class Employee {

	private String empname ;
	private int sal;
	private  int WorkingExperience;
	
	
	public Employee(String empname, int sal, int workingExperience) {
		super();
		this.empname = empname;
		this.sal = sal;
		WorkingExperience = workingExperience;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getWorkingExperience() {
		return WorkingExperience;
	}
	public void setWorkingExperience(int workingExperience) {
		WorkingExperience = workingExperience;
	}
	
    
	
		
	
	
}
