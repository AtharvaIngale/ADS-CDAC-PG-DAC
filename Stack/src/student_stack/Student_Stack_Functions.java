package student_stack;

public class Student_Stack_Functions {
	
	private int top;
	private Student arr[];
	
	public Student_Stack_Functions() {
		top=-1;
		arr = new Student[10];
	}
	
	public Student_Stack_Functions(int size) {
		top=-1;
		arr = new Student[size];
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(top==arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(Student s) {
		if(isFull()) {
			System.out.println("\n Stack overflow...");
			return;
		}else {
			top++;
			arr[top]=s;
			return;
		}
	}
	
	public Student pop() {
		Student d=new Student();        
		if(isEmpty()) {
			return d;
		}else {
			d=arr[top];
			top--;
			return d;
		}
	}
	
	public Student peek() {
		Student d=new Student();
		if(isEmpty()) {
			return d;
		}else {
			d= arr[top];
			return d;
		}
	}
	
	

}
