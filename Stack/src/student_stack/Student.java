package student_stack;

public class Student {
	
	private int rno, mk1, mk2, tot;
	private String name;
	
	public Student() {}
	
	public Student(int rn, String nm, int m1, int m2) {
		rno=rn;
		name=nm;
		mk1=m1;
		mk2=m2;
		tot=mk1+mk2;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getMk1() {
		return mk1;
	}

	public void setMk1(int mk1) {
		this.mk1 = mk1;
	}

	public int getMk2() {
		return mk2;
	}

	public void setMk2(int mk2) {
		this.mk2 = mk2;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno +  ", name=" + name + ", mk1=" + mk1 + ", mk2=" + mk2 + ", total marks=" + tot  + "]";
	}
	
	

}
