package employee_queue;

public class Employee {
	
	private int id, sal;
	private String name;

	public Employee() {}
	
	public Employee(int i, String nm, int s) {
		id=i;
		name=nm;
		sal=s;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal +  "]";
	}
	
	
}
