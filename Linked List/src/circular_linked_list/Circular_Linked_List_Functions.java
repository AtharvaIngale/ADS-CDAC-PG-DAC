package circular_linked_list;

import intLinkedList.Int_List_Node;

public class Circular_Linked_List_Functions {
	
	Int_List_Node last;
	
	//Insert new node at first position
	public void insert_First(int d) {
		Int_List_Node new_node = new Int_List_Node();
		if(last==null) {
			last = new_node;
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		last=new_node;
		return;
	}
	
	//display the nodes
	public void display() {
		Int_List_Node iter = last.getNext();
		System.out.println("List: ");
		do {
			System.out.println(iter.getData() + " ");
			iter=iter.getNext();
		}
		while(true);
	}

}
