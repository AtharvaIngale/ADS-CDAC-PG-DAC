package stack_demo;

public class Student_Class {
	
	private int rollNo;
	private String name, cls;
	
	public Student_Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student_Class(int rollNo, String name, String cls) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.cls = cls;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	@Override
	public String toString() {
		return "Student_Class [rollNo=" + rollNo + ", name=" + name + ", cls=" + cls + "]";
	}
	
	

}
