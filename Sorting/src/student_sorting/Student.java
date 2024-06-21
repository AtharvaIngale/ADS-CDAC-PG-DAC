package student_sorting;

import java.util.Scanner;

public class Student {
	
	private int rollno, mk1, mk2, tot;
	private String name;
	
	public Student(int rollno, String name, int mk1, int mk2) {
		this.rollno = rollno;
		this.mk1 = mk1;
		this.mk2 = mk2;
		this.name = name;
		tot=mk1+mk2;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	
	public static Student [] insertMany(int n) {
		int m1,m2,rollno;
		String name;
		Scanner sc = new Scanner(System.in);
		Student arr[]=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println();
			System.out.print("Enter Roll number: ");
			rollno=sc.nextInt();
			System.out.print("Enter name: ");
			name=sc.next();
			System.out.print("Enter Marks1: ");
			m1=sc.nextInt();
			System.out.print("Enter Marks2: ");
			m2=sc.nextInt();
			arr[i]= new Student(rollno, name, m1, m2);
			System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~");
		}	
		return arr;
	}
	
	public static void display(Student[] arr) {
		for(int i= 0;i<arr.length;i++) {
			System.out.println(" ");
			System.out.print("RollNo: "+ arr[i].rollno);
			System.out.print(" Name: " + arr[i].name);
			System.out.print(" Marks 1: " + arr[i].mk1);
			System.out.print(" Marks 2: " + arr[i].mk2);
			System.out.print(" Total" + arr[i].tot);
			System.out.println(" ");
		}
			
		
		
	}

}
