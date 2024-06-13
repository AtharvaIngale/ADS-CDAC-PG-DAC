package reversing_linked_list;

import java.util.Scanner;

import intLinkedList.Int_List_Node;

public class Reversing_Linked_List {
	
	public Int_List_Node head;
	Int_List_Node prev, next, iter;
	
	public Reversing_Linked_List() {
		prev = next = iter = null;
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
	
	public void reverseLL() {
		iter = head;
		prev = null;
		while(iter != null) {
			next = iter.getNext();
			iter.setNext(prev);
			prev = iter;
			iter = next;
		}		
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
		Reversing_Linked_List rll = new Reversing_Linked_List();
		int ch, data;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Insert First");
			System.out.println("2. Reverse Linked List");
			System.out.println("3. Display Linked List");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1: System.out.println("Enter value: ");
					data = sc.nextInt();
					rll.insertFirst(data);
					break;
					
			case 2: System.out.println("Reversing the Linked List....");
					break;
			
			case 3: System.out.println(rll);
					break;
					
			case 4: System.out.println("Existing...");
					continue;
			
			}
		} while (ch!=5);
	}

}
