package employee_queue;

import java.util.Scanner;

public class Employee_Queue_Main {
	
	public static void main(String[] args) {
		
		int ch;
		Employee_Queue_Functions eqf = new Employee_Queue_Functions();
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Peek");
			System.out.println("Enter your choice: ");
			ch=s.nextInt();
			
			switch(ch) {
			
			case 1: System.out.println("Enter id: ");
					int id=s.nextInt();
					System.out.println("Enter name: ");
					String name= s.next();
					System.out.println("Enter salary: ");
					int sal = s.nextInt();
					Employee e1 = new Employee(id, name, sal);
					eqf.insert(e1);
					break;
					
			case 2: System.out.println("Removed: " + eqf.remove());
					break;
			
			case 3: System.out.println(eqf.peek());
					break;
					
			case 4: break;
			
			default: System.out.println("Enter choice between 1 to 4...");
			
			}
		}
		while(ch!=4); {
			System.out.println("Existing...");
		}
	}

}
