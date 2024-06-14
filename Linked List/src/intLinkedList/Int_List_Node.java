package intLinkedList;

public class Int_List_Node {
	
	public int data;
	public Int_List_Node next;
	
	public Int_List_Node() {
		data=0;
		next=null;
	}
	
	public Int_List_Node(int d) {
		data = d;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Int_List_Node getNext() {
		return next;
	}

	public void setNext(Int_List_Node next) {
		this.next = next;
	}
	
}
