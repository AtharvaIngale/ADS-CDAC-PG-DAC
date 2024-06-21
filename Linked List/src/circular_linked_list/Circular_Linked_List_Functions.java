package circular_linked_list;

import java.util.Scanner;  

public class Circular_Linked_List_Functions {
	
	Circular_Linked_List_Node last;
	
	//Insert new node at first position
	public void insert_First(int d) {
		Circular_Linked_List_Node new_node = new Circular_Linked_List_Node();
		if(last==null) {
			last = new_node;
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		last=new_node;
		return;
	}
	
	public void insert_before(int d, int before) {
		Circular_Linked_List_Node new_node = new Circular_Linked_List_Node(d);
		if (last == null) {
			last = new_node;
			last.setNext(last);
			return;
		}
		if(last.getNext().getData()== before) {
			insert_first(d);
			return;
		}
		
		Circular_Linked_List_Node iter = last.getNext();
		
		do {
			if(iter.getNext().getData()!=before) {
				iter=iter.getNext();
			}else {
				new_node.setNext(iter.getNext());
				iter.setNext(new_node);
				return;
			}
		} while (iter != last);
		System.out.println("no such value found in the list");
		return;
	}
	public void insert_after(int d, int after) {
		Circular_Linked_List_Node new_node = new Circular_Linked_List_Node(d);
		if (last == null) {
			last = new_node;
			last.setNext(last);
			return;
		}
		if(last.getData()== after) {
			insert_last(d);
			return;
		}
		Circular_Linked_List_Node iter = last.getNext();
		
		do {
			if(iter.getData()!=after) {
				iter=iter.getNext();
			}else {
				new_node.setNext(iter.getNext());
				iter.setNext(new_node);
				return;
			}
		} while (iter != last);
		System.out.println("no such value found in the list");
		return;
		
	}
	public void insert_first(int d) {
		Circular_Linked_List_Node new_node = new Circular_Linked_List_Node(d);
		if (last == null) {
			last = new_node;
			last.setNext(last); // self referencing
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		return;
	}

	// It only work in forward direction only so last node will have address of
	// first node
	public void insert_last(int d) {
		Circular_Linked_List_Node new_node = new Circular_Linked_List_Node(d);
		if (last == null) {
			last = new_node;
			last.setNext(last);
			return;
		}
		new_node.setNext(last.getNext());
		last.setNext(new_node);
		last = new_node;
		return;
	}

	public static Circular_Linked_List_Node reverse(Circular_Linked_List_Node state, Circular_Linked_List_Node last) {
		Circular_Linked_List_Node temp, carry;
		if (state.getNext() == last)
			return state;

		temp = reverse(state.getNext(), last);
		carry = state.getNext().getNext();
		state.getNext().setNext(state);
		state.setNext(carry);
		if (state == last) {
			state.setNext(temp);
			return last;
		} else {
			state.setNext(carry);
			return temp;
		}
	}

	public void createList(int n) {
		int data;
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter value :");
			data = s.nextInt();
			this.insert_last(data);
		}
	}

	public void display() {
		if (last == null) {
			System.out.println("List is Empty");
			return;
		}
		Circular_Linked_List_Node iter = last.getNext();
		System.out.print(" List");
		do {
			System.out.print(" -> " + iter.getData());
			iter = iter.getNext();
		} while (iter != last.getNext());
		System.out.println();
		return;
	}

	public int delete_first() {
		int d = -999;
		if (last == null) {
			return d;
		}
		if (last.getNext() == last) {
			d = last.getData();
			last.setNext(null);
			last = null;
			return d;
		}
		Circular_Linked_List_Node deletable = last.getNext();
		d = deletable.getData();
		last.setNext(deletable.getNext());
		deletable.setNext(null);
		deletable = null;
		return d;
	}

	public void insert_by_pos(int d, int pos) {
		Circular_Linked_List_Node new_node = new Circular_Linked_List_Node(d);
		if (last == null) {
			last = new_node;
			last.setNext(last);
			return;
		}
		if (pos == 1) {
			new_node.setNext(last.getNext());
			last.setNext(new_node);
			return;
		}
		Circular_Linked_List_Node iter = last.getNext();
		int i = 1;
		do {
			if(i<pos-1) {
				iter=iter.getNext();
				i++;
			}else {
				new_node.setNext(iter.getNext());
				iter.setNext(new_node);

				if (iter == last) 
					last = new_node;
				return;
			}
		} while (iter != last.getNext());

		System.out.println("Invalid position..!!");
		return;
	}
	
	public int delete_last() {
		int d = -999;
		if(last==null)return d;
		
		if(last.getNext()==last) {
			d=last.getData();
			last.setNext(null);
			last=null;
		}
		Circular_Linked_List_Node deleteable = last.getNext();
		
		while(deleteable.getNext()!= last)
			deleteable=deleteable.getNext();
		
		deleteable.setNext(last.getNext());
		d= last.getData();
		last=deleteable;
		deleteable=deleteable.getNext();
		deleteable=null;
		return d;
	}
	
	public int delete_by_pos(int pos) {
		int d= -999;
		Circular_Linked_List_Node deleteable = last.getNext();
		Circular_Linked_List_Node temp;
		if(last==null)return d;
		if(pos==1) {
			d= deleteable.getData();
			last.setNext(deleteable.getNext());
			return d;
		}	
		int i = 1;
		do {
			if(i<pos-1) {
				deleteable=deleteable.getNext();
				i++;
			}else {
				d= deleteable.getNext().getData();
				temp=deleteable.getNext().getNext();
				deleteable.getNext().setNext(null);
				deleteable.setNext(temp);

				return d;
			}
		} while (deleteable != last.getNext());
		
		System.out.println("Position out of bound.");
		return d;
	}
	
//	//display the nodes
//	public void display() {
//		Circular_Linked_List_Node iter = last.getNext();
//		System.out.println("List: ");
//		do {
//			System.out.println(iter.getData() + " ");
//			iter=iter.getNext();
//		}
//		while(true);
//	}

}
