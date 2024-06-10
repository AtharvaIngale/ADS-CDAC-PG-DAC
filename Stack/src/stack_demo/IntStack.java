package stack_demo;

import java.util.Scanner;

public class IntStack {
	
	private int top;
	private int arr[];
	
	public IntStack() {
		top=-1;
		arr = new int[10];
	}
	
	public IntStack(int size) {
		top=-1;
		arr = new int[size];
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
	
	public void push(int data) {
		if(isFull())
			System.out.println("Stack overflow");
		top++;
		arr[top] = data;
	}
	
	public int pop() {
		int d = -999;
		if(isEmpty()) {
			System.out.println("underflow");
			return d;
		}
		d=arr[top];
		top--;
		return d;		
	}
	
	public int peek() {
		int d=-999;
		if(isEmpty()) {
			System.out.println("underflow");
			return d;
		}
		d=arr[top];
		return d;
	}
	
	
	public static void main(String[] args) {
	
		IntStack st = new IntStack();
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
					data = sc.nextInt();
					st.push(data);
					break;
			case 2: data = st.pop();
					if(data != -999) {
						System.out.println("Popped: " + data);
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
