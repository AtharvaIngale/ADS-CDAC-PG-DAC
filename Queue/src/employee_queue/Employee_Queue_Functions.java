package employee_queue;

public class Employee_Queue_Functions {
	
	int front=-1, rear=-1;
	Employee arr[];
	
	public Employee_Queue_Functions() {
		front = rear = -1;
		arr = new Employee[10];
	}
	
	public Employee_Queue_Functions(int size) {
		front = rear = -1;
		arr = new Employee[size];
	}
	
	public boolean isFull() {
		if(rear==arr.length-1) {
			return true;
		}
		else {
			return false;
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
	
	public void insert(Employee e) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		if(front==-1) {
			front=0;
		}
		rear++;
		arr[rear]=e;
	}
	
	public Employee peek() {
		Employee e1 = new Employee();
		if(isEmpty()) {
			System.out.println("Queue is empty...");
			return e1;
		}
		e1=arr[rear];
		return e1;
	}
	
	public Employee remove() {
		Employee e2 = new Employee();
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return e2;
		}
		e2=arr[front];
		front++;
		return e2;
	}

}
