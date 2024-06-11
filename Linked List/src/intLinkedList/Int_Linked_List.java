package intLinkedList;

public class Int_Linked_List {
	
	Int_List_Node head;
	
	public Int_Linked_List() {
		head = null;
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

}
