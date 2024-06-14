package recursive_implementation;

import intLinkedList.Int_Linked_List;
import intLinkedList.Int_List_Node;

public class Display_Linked_List {

	static void disp(Int_List_Node temp)
	{
	 if(temp==null) return;
	 disp(temp.getNext());
	 System.out.println(temp.getData());
	}
	
	public static void main(String[] args) {
		Int_Linked_List ll = new Int_Linked_List();
		ll.insert_last(10);
		ll.insert_last(20);
		ll.insert_last(30);
		ll.insert_last(40);
		disp(ll.getHead());
	}
	
}
