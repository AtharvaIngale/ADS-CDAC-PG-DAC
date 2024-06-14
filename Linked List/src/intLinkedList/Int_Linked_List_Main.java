package intLinkedList;

import java.util.Scanner;

public class Int_Linked_List_Main {
	
	public static void main(String[] args) {
		Int_Linked_List obj = new Int_Linked_List();
		int ch, data, pos;
		do {
			System.out.println("1.Insert First");
			System.out.println("2.Insert Last");
			System.out.println("3.Insert By Pos");
			System.out.println("4.Insert Before Data");
			System.out.println("5.Insert In Sorted Order");
			System.out.println("6.Delete First");
			System.out.println("7.Delete Last");
			System.out.println("8.Delete By Pos");
			System.out.println("9.Count number of nodes");
			System.out.println("10.Display Alternate Nodes");
			System.out.println("11.Display");
			System.out.println("12.Insert After Data");
			System.out.println("13. Reverse the nodes");
			System.out.println("14. Find the middle node");
			System.out.println("15.Exit....");
			System.out.println("Enter Your Choice: ");
			Scanner s = new Scanner(System.in);
			ch = s.nextInt();
			
			switch(ch)
			{
			case 1: System.out.print("Enter Value to insert first: ");
					data = s.nextInt();
					obj.insertFirst(data);
					break;
			
			case 2:	System.out.print("Enter Value to insert last: ");
					data = s.nextInt();
					obj.insert_last(data);
					break;
					
			case 3:	System.out.print("Enter Value to insert_by_pos: ");
					data = s.nextInt();
					System.out.print("Enter Position to insert: ");
					pos = s.nextInt();
					obj.insert_by_pos(data, pos);
					break;
					
			case 4:	System.out.print("Enter Value to insert before data: ");
					data = s.nextInt();
					System.out.println("Enter Position want to insert before");
					pos = s.nextInt();
					obj.insert_before(data, pos);
					break;
					
			case 5: System.out.print("Enter Value to insert sorted data: ");
					data = s.nextInt();
					obj.insert_sorted(data);
					break;
					
			case 6:	data = obj.deleteFirst();
					if(data!=-999) {
						System.out.println(data+" Deleted");
					}
					break;
					
			case 7:	data = obj.deleteLast();
					if(data!=-999) {
						System.out.println(data+" Deleted");
					}
					break;
					
			case 8:	System.out.println("Enter Value to delete by position");
					pos = s.nextInt();
					data = obj.delete_by_pos(pos);
					if(data!=-999) {
						System.out.println(data+" Deleted");
					}
					break;
					
			case 9:	data=obj.count();
					System.out.println("No of Nodes are : "+data);
					break;
					
			case 10:obj.display_alternateNode();
					break;
					
			case 11:System.out.println(obj);
					break;
					
			case 12:System.out.print("Enter Value to insert After data: ");
					data = s.nextInt();
					System.out.println("Enter Position want to insert After: ");
					pos = s.nextInt();
					obj.insert_after(data, pos);
					break;
				
			case 13:System.out.println("Reversing the nodes");
					obj.reverseLL();
					break;
					
			case 14:System.out.println("The middle node is: " + obj.findingMiddleNode());
					break;
			
			default: System.out.println("Enter value is not in between 1 to 12 Enter Again!!");
			}
		}
		while(ch!=13);
	
	}

}
