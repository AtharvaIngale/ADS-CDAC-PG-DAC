package doubly_linked_list;

public class Doubly_Linked_List_Functions {
	
	private Doubly_Linked_List_Node head;
	
	public Doubly_Linked_List_Functions() {
		head = null;
	}
	
	public Doubly_Linked_List_Node getHead() {
		return head;
	}
	
	public void setHead(Doubly_Linked_List_Node h) {
		head = h;
	}
	
	//insert new element at first position
	public void insert_first(int d) {
		Doubly_Linked_List_Node new_node = new Doubly_Linked_List_Node();
		if(head==null) {
			head = new_node;
			return;
		}
		new_node.setNext(head);
		head.setPrev(new_node);
		head = new_node;
		return;
	}
	
	//Insert new element at last position
	public void insert_last(int d) {
		Doubly_Linked_List_Node new_node = new Doubly_Linked_List_Node(d);
		if(head==null) {
			head = new_node;
			return;
		}
		Doubly_Linked_List_Node iter = head;
		while(iter.getNext()!=null) {
			iter = iter.getNext();
		}
		new_node.setPrev(iter);
		iter.setNext(new_node);
		return;
	}
	
	//Insert new element at desired position
	public void insert_By_Pos(int d, int pos) {
		Doubly_Linked_List_Node new_node = new Doubly_Linked_List_Node(d);
		if(head == null) {
			head = new_node;
			return;
		}
		if(pos == 1) {
			head.setPrev(new_node);
			new_node.setNext(head);
			head = new_node;
			return;
		}
		int i;
		Doubly_Linked_List_Node iter = head;
		for(i=1; i<pos-1 && iter.getNext()!=null; i++) {
			iter = iter.getNext();
		}
		new_node.setNext(iter.getNext());
		new_node.setPrev(iter);
		if(iter.getNext()!=null) {
			iter.getNext().setPrev(new_node);
			iter.setNext(new_node);
		}
	}
	
	//Delete existing element from first position
	public int delete_First() {
		int d=-999;
		if(head==null) {
			return -999;
		}
		d=head.getData();
		Doubly_Linked_List_Node deletable = head;
		head = head.getNext();
		if(head!=null) {
			head.setPrev(null);
		}
		deletable = null;
		return d;
	}
	
	//Delete existing element from last position
	public int delete_Last() {
		int d=-999;
		if(head==null) {
			return d;
		}
		Doubly_Linked_List_Node iter = head;
		while(iter.getNext()!=null) {
			iter = iter.getNext();
		}
		if(iter.getPrev()!=null) {
			iter.getPrev().setNext(null);
		}
		d=iter.getData();
		iter = null;
		return d;
	}
	
	//Delete existing element from desired position
	public int delete_By_Pos(int pos) {
		int d=-999;
		Doubly_Linked_List_Node deletable;
		if(head==null) {
			return d;
		}
		if(pos==1) {
			d=head.getData();
			deletable = head;
			head = head.getNext();
			if(head!=null) {
				head.setPrev(null);
			}
			deletable = null;
			return d;
		}
		int i;
		deletable = head;
		for(i=1; i<pos; i++) {
			deletable = deletable.getNext();
			if(deletable==null) {
				return d;
			}
		}
		d=deletable.getData();
		deletable.getPrev().setNext(deletable.getNext());
		if(deletable.getNext()!=null) {
			deletable.getNext().setPrev(deletable.getPrev());
		}
		deletable = null;
		return d;
	}
	
	//Add element to empty Doubly Linked List
	public int add_To_Empty(int data) {
		int d=-999;
		Doubly_Linked_List_Functions dll = new Doubly_Linked_List_Functions();
		if(head==null) {
			dll.insert_first(data);
		}
		return d;
	}
	
	//To creating nodes by specifing the no. of nodes
//	public int create_List(int no) {
//		
//	}

	@Override
	public String toString() {
		return "Doubly_Linked_List_Functions [head=" + head + "]";
	}
	
	

}






