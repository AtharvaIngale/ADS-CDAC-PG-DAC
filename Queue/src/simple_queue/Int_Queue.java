package simple_queue;

import java.util.Scanner;

class Int_Queue {
	
	int front, rear;
	int arr[];
	
	public Int_Queue() {
		front = rear = -1;
		arr = new int[10];
	}
	
	public Int_Queue(int size) {
		front = rear = -1;
		arr = new int[size];
	}
	
	public boolean isFull() {
		if(rear < arr.length) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isEmpty() {
		if((front==-1) || (front==rear+1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insert(int d) {
		if(isFull()) {
			System.out.println("Full..");
			return;
		}
		if(front==-1) {
			front=0;
		}
		rear = rear+1;
		arr[rear]=d;
		return;
	}
	
	public int remove() {
		int d = -999;
		if(isEmpty()) {
			System.out.println("Queue is empty..");
			return d;
		}
		d=arr[front];
		front = front+1;
		return d;
	}
	
	public int peek() {
		int d=-999;
		if(isEmpty()) {
			System.out.println("Queue is empty...");
			return d;
		}
		d=arr[rear];
		return d;
	}
	
	public static void main(String[] args) {
		Int_Queue iq = new Int_Queue();
		int ch, data;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Peek");
			System.out.println("4. Exit");
			System.out.print("Enter your choice(1-4)..  ");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1: System.out.print("Enter value: ");
					data = sc.nextInt();
					iq.insert(data);
					break;
			case 2: data = iq.remove();
					if(data != -999) {
						System.out.println("Removed: " + data);
					}
					break;
			case 3: System.out.println("Peeked: " + iq.peek());
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
