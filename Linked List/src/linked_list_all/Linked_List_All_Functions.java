package linked_list_all;

import java.util.Scanner;

import intLinkedList.Int_List_Node;

public class Linked_List_All_Functions {
	
	private Int_List_Node head;

	public Linked_List_All_Functions() {
		head = null;
	}

	public Int_List_Node getHead() {
		return head;
	}

	public void setHead(Int_List_Node head) {
		this.head = head;
	}

	public void insertFirst(int d) {
		Int_List_Node new_node = new Int_List_Node(d);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.setNext(head);
		head = new_node;
		return;
	}

	public void insert_last(int d) {
		Int_List_Node new_node = new Int_List_Node(d);
		if (head == null) {
			head = new_node;
			return;
		}
		Int_List_Node iter = head;

		while (iter.getNext() != null)
			iter = iter.getNext();

		iter.setNext(new_node);
		return;
	}

	public void insert_by_pos(int d, int pos) {
		Int_List_Node new_node = new Int_List_Node(d);
		if (head == null) {
			head = new_node;
			return;
		}
		if (pos == 1) {
			// insertFirst(d)
			new_node.setNext(head);
			head = new_node;
			return;
		}
		int i;
		Int_List_Node iter = head;
		for (i = 1; i < pos - 1 && iter.getNext() != null; i++) {
			iter = iter.getNext();
		}

		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}

	public int deleteFirst() {
		int d = -999;
		@SuppressWarnings("unused")
		Int_List_Node deleteable;
		if (head == null)
			return d;
		if (head.getNext() == null) {
			d = head.getData();
			head = null;
			return d;
		}
		deleteable = head;
		d = head.getData();
		head = head.getNext();
		deleteable = null;
		return d;

	}

	public int deleteLast() {
		int d = -999;

		Int_List_Node deleteable;

		if (head == null)
			return d;

		if (head.getNext() == null) {
			d = head.getData();
			head = null;
			return d;
		}

		Int_List_Node iter = head;

		while (iter.getNext().getNext() != null)
			iter = iter.getNext();

		deleteable = iter.getNext();
		d = deleteable.getData();
		iter.setNext(null);
		deleteable = null;
		return d;
	}

	public int delete_by_pos(int pos) {
		int d = -999;

		Int_List_Node deleteable;

		if (head == null)
			return d;

		if (pos == 1) {
			d = head.getData();
			deleteable = head;
			head = head.getNext();
			deleteable = null;
		}

		Int_List_Node iter = head;

		for (int i = 1; (i < pos - 1) && (iter.getNext() != null); i++)
			iter = iter.getNext();

		if (iter.getNext() != null) {
			deleteable = iter.getNext();
			d = deleteable.getData();
			iter.setNext(iter.getNext().getNext());
			deleteable = null;
		} else
			System.out.println("invalid Position");

		return d;
	}

	public void insert_before(int d, int before) {

		Int_List_Node new_node = new Int_List_Node(d);
		if (head == null)
			return;

		if (head.getData() == before) {
			new_node.setNext(head);
			head = new_node;
			return;
		}

		Int_List_Node iter = head;

		while ((iter.getNext() != null) && (iter.getNext().getData() != before)) {
			iter = iter.getNext();
		}

		if (iter.getNext() != null) {
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);
		}
		return;
	}

	public void insert_After(int d, int after) {
		if (head == null) {
			insertFirst(d);
			return;
		}
		Int_List_Node new_node = new Int_List_Node(d);	
		Int_List_Node iter = head;
		if (iter.getData() == after) {
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);
			return;
		}
		while ((iter.getNext() != null) && (iter.getData() != after)) 
			iter = iter.getNext();
		
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}

	public void insert_sorted(int d) {
		Int_List_Node new_node = new Int_List_Node(d);

		if ((head == null) || (d < head.getData())) {
			new_node.setNext(head);
			head = new_node;
			return;
		}
		Int_List_Node iter = head;

		while ((iter.getNext() != null) && (d > iter.getNext().getData()))
			iter = iter.getNext();

		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}

	public int count() {
		int cnt = 0;
		Int_List_Node iter = head;
		if (head == null)
			return 0;

		while (iter != null) {
			cnt++;
			iter = iter.getNext();
		}
		return cnt;
	}

	public void display_alternativeNode() {
		if (head == null) {
			System.out.println("List Empty");
			return;
		}
		Int_List_Node iter = head;
		System.out.print( "Alternate List ");
		while (iter != null) {
			System.out.print(" -> "+iter.getData());
			if (iter.getNext() != null)
				iter = iter.getNext().getNext();
			else
				iter = iter.getNext();
		}
		System.out.println();
	}

	public String toString() {
		String str = new String(" ");
		if (head == null)
			return "List is empty..!!";

		Int_List_Node itr = head;
		str = "\n List : ";
		while (itr != null) {
			str = str + " -> " + itr.getData();
			itr = itr.getNext();
		}
		return str;
	}
	
	public static Linked_List_All_Functions concateToThirdList(Linked_List_All_Functions list1, Linked_List_All_Functions list2){
		Linked_List_All_Functions list3 = new Linked_List_All_Functions();
		Int_List_Node iter = list1.getHead();
		Int_List_Node iter2 = list2.getHead();
		
		while(iter.getNext()!=null) {
			list3.insert_last(iter.getData());
			iter=iter.getNext();
		}
		list3.insert_last(iter.getData());
		while(iter2.getNext()!=null) {
			list3.insert_last(iter2.getData());
			iter2=iter2.getNext();
		}
		list3.insert_last(iter2.getData());
		return list3;		
	}
	
	public void deleteList() {
		head=null;
		return;
	}

	public void concate(Linked_List_All_Functions list2) {
		Int_List_Node iter = head;
		while(iter.getNext()!=null)
			iter=iter.getNext();
		
		//System.out.println(iter.getNext());
		iter.setNext(list2.getHead());
		return;
	}

	public void reverseList() {
		Int_List_Node prev,next,iter;
		iter = head;
		prev= null;
		
		while(iter != null) {
			next = iter.getNext();
			iter.setNext(prev);
			prev = iter;
			iter = next;
		}
		head= prev;
	}
	
	public void createList (int n) {
   	 int data;
   	 Scanner s = new Scanner(System.in);
   	 for(int i=1;i<=n;i++) {
   		 System.out.print("Enter value :");
   		 data= s.nextInt();
   		 this.insert_last(data);
   	 }
    }
	
	public static Int_List_Node reverse(Int_List_Node state)
	{
		Int_List_Node temp;
		if(state.getNext()==null) return state;
		
		temp=reverse( state.getNext());
		state.getNext().setNext(state);
		state.setNext(null);
		
		return temp;
	}

	
	public void findMiddle() { // tortoise and hare method  
		Int_List_Node slow,fast;
		slow=fast=head;
		// time complexity is O(n/2)
		while((fast!=null)&&(fast.getNext()!= null)) {
			slow = slow.getNext();
			fast= fast.getNext().getNext();
		}
		System.out.println("Middle element is : "+ slow.getData());
	}

}
