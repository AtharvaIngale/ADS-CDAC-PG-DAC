package circular_queue;

import java.util.Scanner;

class Int_Circular_Queue {
	
	int front, rear;
	int[] arr;
	
	public Int_Circular_Queue() {
		front = rear = -1;
		arr = new int[10];
	}
	
	public Int_Circular_Queue(int size) {
		front = rear = -1;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		if(front==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if((front==0) || (rear==arr.length-1) || (front==rear+1)) {
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
		if(rear==arr.length-1) {
			rear=0;
		}
		else
			rear = rear+1;
		arr[rear]=d;
		return;
	}
	
	public int remove() {
		int d=-999;
		if(isEmpty()) {
			System.out.println("Empty");
			return d;
		}
		d=arr[front];
		if(front==rear) {
			front=-1;
			rear=1;
		}
		else if(front==arr.length-1) {
			front=0;
		}
		else {
			front = front+1;
		}
		return d;
	}
	
	public int peek() {
		int d=-999;
		if(isEmpty()) {
			System.out.println("Empty...");
			return d;
		}
		d=arr[front];
		return d;
	}
	
	public static void main(String[] args) {
		Int_Circular_Queue icq = new Int_Circular_Queue();
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
					icq.insert(data);
					break;
			case 2: data = icq.remove();
					if(data != -999) {
						System.out.println("Removed: " + data);
					}
					break;
			case 3: System.out.println("Peeked: " + icq.peek());
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
