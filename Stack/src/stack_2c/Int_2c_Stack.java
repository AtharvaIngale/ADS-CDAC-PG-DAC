package stack_2c;

import java.util.Scanner;

import stack_demo.IntStack;

public class Int_2c_Stack {
	
	private int topA, topB;
	private int arr[];
	
	public Int_2c_Stack() {
		topA=-1;
		topB=50;
		arr = new int[50];
	}
	
	public Int_2c_Stack(int size) {
		topA=-1;
		topB=size;
		arr = new int[size];
	}
	
	public boolean isFull() {
		if ((topB-topA) == 1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmptyA() {
		if(topA == -1)
			return true;
		else
			return false;
	}
	
	public boolean isEmptyB() {
		if(topB == 50)
			return true;
		else
			return false;
	}
	
	public void pushA(int data) {
		if(isFull())
			System.out.println("Stack overflow");
		topA++;
		arr[topA] = data;
	}
	
	public void pushB(int data) {
		if(isFull())
			System.out.println("Stack overflow");
		topB--;
		arr[topB] = data;
	}
	
	public int popA() {
		int d = -999;
		if(isEmptyA()) {
			System.out.println("underflow");
			return d;
		}
		d=arr[topA];
		topA--;
		return d;		
	}
	
	public int popB() {
		int d = -999;
		if(isEmptyB()) {
			System.out.println("underflow");
			return d;
		}
		d=arr[topB];
		topB++;
		return d;		
	}
	
	public int peekA() {
		int d=-999;
		if(isEmptyA()) {
			System.out.println("underflow");
			return d;
		}
		d=arr[topA];
		return d;
	}
	
	public int peekB() {
		int d=-999;
		if(isEmptyB()) {
			System.out.println("underflow");
			return d;
		}
		d=arr[topB];
		return d;
	}

	public static void main(String[] args) {
		
		Int_2c_Stack st = new Int_2c_Stack();
		int ch, sub_ch, data;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Stack A");
			System.out.println("2. Stack B");
			System.out.println("3. Exit");
			System.out.print("Enter your choice(1-3)..  ");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1: System.out.println("***** Stack A *****");
					System.out.println("1. Push");
					System.out.println("2. Pop");
					System.out.println("3. Peek");
					System.out.println("4. Exit");
					System.out.print("Enter your choice(1-4): ");
					sub_ch = sc.nextInt();
					switch (sub_ch) {
					case 1: System.out.print("Enter value: ");
							data = sc.nextInt();
							st.pushA(data);
							break;
					case 2: data = st.popA();
							if(data != -999) {
								System.out.println("Popped: " + data);
							}
							break;
					case 3: System.out.println("Peeked: " + st.peekA());
							break;
					case 4: break;
					 }
					break;
			case 2: System.out.println("***** Stack B *****");
					System.out.println("1. Push");
					System.out.println("2. Pop");
					System.out.println("3. Peek");
					System.out.println("4. Exit");
					sub_ch = sc.nextInt();
					switch (sub_ch) {
					case 1: System.out.print("Enter value: ");
							data = sc.nextInt();
							st.pushB(data);
							break;
					case 2: data = st.popB();
							if(data != -999) {
								System.out.println("Popped: " + data);
							}
							break;
					case 3: System.out.println("Peeked: " + st.peekB());
							break;
					case 4: break;
					 }
					break;
			case 3: break;
			default:
				System.out.println("Unexpected value: " + ch);
			}
		}
		while(ch != 3);

	}

}
