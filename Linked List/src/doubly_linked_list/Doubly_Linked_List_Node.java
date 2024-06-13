package doubly_linked_list;

public class Doubly_Linked_List_Node {
	
	private int data;
	private Doubly_Linked_List_Node prev, next;
	
	public Doubly_Linked_List_Node() {
		data = 0;
		prev = next = null;
	}
	
	public Doubly_Linked_List_Node(int d) {
		data = d;
		prev = next = null;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int d) {
		data = d;
	}
	
	public Doubly_Linked_List_Node getPrev() {
		return prev;
	}
	
	public void setPrev(Doubly_Linked_List_Node p) {
		prev = p;
	}
	
	public Doubly_Linked_List_Node getNext() {
		return next;
	}
	
	public void setNext(Doubly_Linked_List_Node n) {
		next = n;
	}

}
