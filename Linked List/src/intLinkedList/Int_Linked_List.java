package intLinkedList;

public class Int_Linked_List {
	
	Int_List_Node head;
	
	public Int_Linked_List() {
		head = null;
	}
	
	public Int_List_Node getHead() {
		return head;
	}

	public void setHead(Int_List_Node head) {
		this.head = head;
	}


	//Insert the node in first position
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
	
	//Display the data in node
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
	
	//Insert the node in last position
	public void insert_last(int d)
	{
		Int_List_Node new_node = new Int_List_Node(d);
		if(head==null)
		{
			head = new_node;
			return;
		}
		Int_List_Node itr = head;
		while(itr.getNext()!=null)
			itr = itr.getNext();
		itr.setNext(new_node);
		return;
	}
	
	//Insert the node in desired position of user
	public void insert_by_pos(int data, int pos)
	{
		Int_List_Node new_node = new Int_List_Node(data);
		
		if(head==null){
			head = new_node;
			return;
		}
		if(pos==1){
			new_node.setNext(head);
			head = new_node;
			return;
		}
		
		int i;
		Int_List_Node itr = head;
		for(i=1; i<pos-1 && itr.getNext()!=null; i++, itr = itr.getNext());		
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		return;
	}
	
	//Delete the node present in first position
	public int deleteFirst()
	{
		int d = -999;
		Int_List_Node deletable;
		
		if(head==null){
			return d;
		}
		if(head.getNext()==null){
			d = head.getData();
			head = null;
			return d;
		}
		
		deletable = head;
		d = head.getData();
		head = head.getNext();
		deletable = null;
		return d;
	}
	
	//Delete the node present in last position
	public int deleteLast()
	{
		int d = -999;
		Int_List_Node deletable;
		if(head==null){
			return d;
		}
		if(head.getNext()==null){
			d = head.getData();
			head = null;
			return d;
		}
		
		Int_List_Node itr = head;
		while(itr.getNext().getNext()!=null)
			itr = itr.getNext();
		
		deletable = itr.getNext();
		d = deletable.getData();
		itr.setNext(null);
		deletable = null;
		return d;
	}

	//Deleting the node based on user desired position
	public int delete_by_pos(int pos)
	{
		int d=-999;
		Int_List_Node deletable;
		
		if(head==null){
			return d;
		}		
		if(pos==1){
			d=head.getData();
			deletable = head;
			head = head.getNext();
			deletable = null;
			return d;
		}
			
		Int_List_Node itr = head;
		for(int i = 1; i<pos-1 && itr.getNext()!=null; i++)
			itr = itr.getNext();
		if(itr.getNext()!=null){
			deletable = itr.getNext();
			d = deletable.getData();
			itr.setNext(itr.getNext().getNext());
		}
		else{
			System.out.println("Invalid Position!");
		}
		return d;
	}
		
	//Inserting data before a user specified position
	public void insert_before(int d, int before)
	{
		Int_List_Node new_node = new Int_List_Node(d);
		if(head==null){
			return;
		}		
		if(head.getData()==before){
			new_node.setNext(head);
			head = new_node;
			return;
		}
		
		Int_List_Node itr = head;		
		while((itr.getNext()!=null) && (itr.getNext().getData()!=before))
			itr = itr.getNext();
			
		if(itr.getNext()!=null){
			new_node.setNext(itr.getNext());
			itr.setNext(new_node);
		}
		return;
	}
		
	//Inserting data after user specified position
	public void insert_after(int d, int after)
	{
		if(head==null){
			insertFirst(d);
			return;
		}
		Int_List_Node new_node = new Int_List_Node(d);
		Int_List_Node itr = head;
		if(itr.getData() == after){
			new_node.setNext(itr.getNext());
			itr.setNext(new_node);
			return;
		}		
		while((itr.getNext()!=null) && (itr.getNext().getData()!=after)) {
			itr = itr.getNext();
		}
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		return;
	}	
	
	//Sort the data in ascending order
	public void insert_sorted(int d)
	{
		Int_List_Node new_node = new Int_List_Node(d);
		if((head==null)||(d<head.getData())){
			new_node.setNext(head);
			head = new_node;
			return;
		}		
		Int_List_Node itr = head;		
		while(itr.getNext()!=null && d>itr.getNext().getData()) {
			itr = itr.getNext();
		}
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		return;
	}
		
	// Count the number of nodes
	public int count()
	{
		int cnt = 0;
		Int_List_Node itr = head;
		if(head==null) {
			return 0;
		}
		while(itr!=null){
			cnt++;
			itr = itr.getNext();
		}
		return cnt;		
	}
		
	//Display Alternate node
	public void display_alternateNode()
	{
		if(head==null){
			System.out.println("List is Empty");
			return;
		}
		Int_List_Node itr = head;
		while(itr!=null){
			System.out.println(itr.getData()+" ");
			if(itr.getNext()!=null) {
				itr = itr.getNext().getNext();
			}
			else {
				itr = itr.getNext();
			}
		}
	}
	
	//Reversing the node
	public void reverseLL() {
		Int_List_Node prev, next, iter;
		iter = head;
		prev = null;
		while(iter != null) {
			next = iter.getNext();
			iter.setNext(prev);
			prev = iter;
			iter = next;
		}		
	}
	
	//finding the middle node using tortoise and hare algorithm
	public Int_List_Node findingMiddleNode() {
		Int_List_Node slow, fast, head;
		slow = fast = head = this.head;
		Int_List_Node d;
		while((fast!=null) && (fast.getNext()!=null)) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;
	}
	
	

}




