package jdbc;

public class Student {

	private int id;
	private String name;
	private long phno;
	private String gender;

	public Student(int id, String name, long phno, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
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

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
