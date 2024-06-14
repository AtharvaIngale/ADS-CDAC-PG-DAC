package recursive_implementation;

import intLinkedList.Int_Linked_List;
import intLinkedList.Int_List_Node;

public class Lenght_Of_LL {
	
	public int length (Int_List_Node p)
	{
	 if(p == null) {
		 return 0;
	 }
	 return 1 + length(p.getNext());
	}
	
	public static void main(String[] args) {
		Int_Linked_List ll = new Int_Linked_List();
		ll.insert_last(10);
		ll.insert_last(20);
		ll.insert_last(30);
		ll.insert_last(40);
		System.out.println(ll.length(ll.getHead()));
	}

}
