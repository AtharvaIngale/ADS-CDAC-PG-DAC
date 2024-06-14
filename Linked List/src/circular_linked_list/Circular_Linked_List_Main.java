package circular_linked_list;

import java.util.Scanner;

public class Circular_Linked_List_Main {
	
	public static void main(String[] args) {
		Circular_Linked_List_Functions cll = new Circular_Linked_List_Functions();
		int ch, data, pos;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Insert first");
			System.out.println("2. Display");
			System.out.println("3. Exit");
			System.out.println("Insert your choice: ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1: System.out.print("Enter the value: ");
					data= sc.nextInt();
					cll.insert_First(data);
					break;
					
			case 2: cll.display();
					
			default: System.out.println("Enter valid choice(1-10)...");
			}
		}
		while(ch!=10);
	}

}
