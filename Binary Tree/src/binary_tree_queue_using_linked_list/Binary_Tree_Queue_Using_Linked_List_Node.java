package binary_tree_queue_using_linked_list;

public class Binary_Tree_Queue_Using_Linked_List_Node {
	
	private int data;
	private Binary_Tree_Queue_Using_Linked_List_Node next;
	
	public Binary_Tree_Queue_Using_Linked_List_Node() {
		data=0;
		next=null;
	}
	
	public Binary_Tree_Queue_Using_Linked_List_Node(int d) {
		data=d;
		next=null;
	}

	public Binary_Tree_Queue_Using_Linked_List_Node getNext() {
		return next;
	}

	public void setNext(Binary_Tree_Queue_Using_Linked_List_Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	

}
