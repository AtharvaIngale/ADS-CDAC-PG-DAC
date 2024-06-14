package circular_linked_list;

import intLinkedList.Int_List_Node;

public class Circular_Linked_List_Node {
	Int_List_Node last;
	
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
