package stack_demo;

import java.util.Scanner;

public class Student_Stack {
	
	private int top;
	private Student_Class[] arr;
	
	public Student_Stack() {
		top=-1;
		arr = new Student_Class[10];
	}
	
	public Student_Stack(int size) {
		top=-1;
		arr = new Student_Class[size];
	}
	
	public boolean isFull() {
		if (top == arr.length - 1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public void push(Student_Class data) {
		if(isFull())
			System.out.println("Stack overflow");
		top++;
		arr[top] = data;
	}
	
	public char pop() {
		int d = -999;
		if(isEmpty()) {
			System.out.println("underflow");
		}
		d=arr[top];
		top--;
		return (char)d;		
	}
	
	public char peek() {
		int d=-999;
		if(isEmpty()) {
			System.out.println("underflow");
		}
		d=arr[top];
		return (char)d ;
	}
	
	
	public static void main(String[] args) {
	
		Student_Stack st = new Student_Stack();
		int ch, data;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Exit");
			System.out.println("Enter your choice(1-4)..  ");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1: System.out.println("Enter value: ");
					data = sc.next().charAt(0);
					st.push((char) data);
					break;
			case 2: data = st.pop();
					if(data != -999) {
						System.out.println("Popped: " + (char)data);
					}
					break;
			case 3: System.out.println("Peeked: " + st.peek());
					break;
			case 4: break;
			default:
				System.out.println("Unexpected value: " + ch);
			}
		}
		
		while(ch!=5); {			
		}
	}

}
