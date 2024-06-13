package doubly_linked_list;

import java.util.Scanner;

public class Doubly_Linked_List_Main {
	
	public static void main(String[] args) {
		
		Doubly_Linked_List_Functions dll = new Doubly_Linked_List_Functions();
		int ch, data, pos;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("1. Create List");
			System.out.println("2. Insert First");
			System.out.println("3. Insert Last");
			System.out.println("4. Insert By Pos");
			System.out.println("5. Delete First");
			System.out.println("6. Delete Last");
			System.out.println("7. Delete by Pos");
			System.out.println("8. Add to Empty Linked List");
			System.out.println("9. Display");
			System.out.println("10. Exit");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1: System.out.println("Enter no of nodes to add: ");
					data = sc.nextInt();
					dll.add_To_Empty(data);
			
			case 2: System.out.println("Enter value: ");
					data = sc.nextInt();
					dll.insert_first(data);
					
			case 3: System.out.println("Enter value: ");
					data = sc.nextInt();
					dll.insert_last(data);
					
			case 4: System.out.println("Enter value: ");
					data = sc.nextInt();
					System.out.println("Enter the position: ");
					pos = sc.nextInt();
					dll.insert_By_Pos(data, pos);
					
					
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}while(ch!=9);
	}
	
}
