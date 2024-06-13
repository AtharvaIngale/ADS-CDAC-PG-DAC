package middle_node;

import java.util.Scanner;

import intLinkedList.Int_List_Node;

public class Finding_Middle_Node {
	
	Int_List_Node slow, fast, head;
	
	public Finding_Middle_Node() {
		slow = fast = head;
	}
	
	public void insertFirst(int d) {
		Int_List_Node new_node = new Int_List_Node(d);
		if(head==null) {
			head = new_node;
			return;
		}
		new_node.setNext(head);
		head = new_node;
		return;
	}
	
	public int findingMiddleNode() {
		int d = -999;
		while((fast!=null) && (fast.getNext()!=null)) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			return slow.data;
		}
		return d;
	}
	
	public String toString() {
		String str = new String();
		if(head==null) {
			return "List is empty..";
		}
		Int_List_Node itr = head;
		str="list: ";
		while(itr != null) {
			str = str + " -> " + itr.getData();
			itr=itr.getNext();
		}
		return str;
	}
	
	public static void main(String[] args) {
		Finding_Middle_Node rll = new Finding_Middle_Node();
		int ch, data;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Insert First");
			System.out.println("2. Finding the middle node of Linked List");
			System.out.println("3. Display Linked List");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1: System.out.println("Enter value: ");
					data = sc.nextInt();
					rll.insertFirst(data);
					break;
					
			case 2: System.out.println("Middle node the Linked List is: " + rll.findingMiddleNode());
					break;
			
			case 3: System.out.println(rll);
					break;
					
			case 4: System.out.println("Existing...");
					continue;
			
			}
		} while (ch!=4);
	}
	

}
