package circular_linked_list;

import intLinkedList.Int_List_Node;

public class Circular_Linked_List_Node {
	Int_List_Node last, next;
	
	public Int_List_Node getNext() {
		return next;
	}

	public void setNext(Int_List_Node next) {
		this.next = next;
	}

	public Circular_Linked_List_Node() {
		last = null;
	}

	public Int_List_Node getLast() {
		return last;
	}

	public void setLast(Int_List_Node l) {
		last = l;
	}
	
	

}
