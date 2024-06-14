package recursive_implementation;

import intLinkedList.Int_Linked_List;
import intLinkedList.Int_List_Node;

public class Reverse {
	
	Int_List_Node head;
	
	public static Int_List_Node reverse(Int_List_Node head)
	{
		Int_List_Node temp;
		if(head.getNext()==null) { 
			return head;
		}
	 temp=reverse( head.getNext());
	 head.getNext().setNext(head);
	 head.setNext(null);
	 return temp;
	}
	
	public static void main(String[] args) {
		Int_Linked_List list = new Int_Linked_List();
		list.insert_last(10);
		list.insert_last(20);
		list.insert_last(30);
		list.insert_last(40);
		System.out.println(list);
		list.setHead(reverse(list.getHead()));
		System.out.println(list);
	}
}
