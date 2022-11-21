package streamAPI;

public class Student {

	private  int id;
	private  String name;
	private String city;
	private long marks;
	private String gender;
	
	
	public Student(int id, String name, String city, long marks, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.marks = marks;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
