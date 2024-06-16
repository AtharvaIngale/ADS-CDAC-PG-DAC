package binary_tree_queue_using_linked_list;

import intLinkedList.Int_List_Node;

public class Binary_Tree_Queue_Using_Linked_List_Functions {
	
	Binary_Tree_Queue_Using_Linked_List_Node front,rear;
	 
	 public Binary_Tree_Queue_Using_Linked_List_Functions()	 {
		 front = rear = null;
	 }
	 
	 public boolean isEmpty()	 {
		 if(front == null)
			 return true;
		 else
			 return false;
		 
		 
	 }
	 
	 
	 
	 public void enQueue(int d)	 {
		 Binary_Tree_Queue_Using_Linked_List_Node new_node = new Binary_Tree_Queue_Using_Linked_List_Node(d);
		 if(front== null)
		 {
			 front = rear= new_node;
			 return ;
		 }
		 rear.setNext(new_node);
		 rear= new_node;
		 //System.out.println(d);
		 return ;
	 }
	 
	 
	 public int deQueue()	 {
		 int d = -999;
		 if(isEmpty())
			 return d;
		 
		 d= front.getData();
		 front= front.getNext();
		 return d;
	 }

	@Override
	public String toString() {
		String str = new String();
		if(isEmpty()) {
			return "List is empty..";
		}
		Binary_Tree_Queue_Using_Linked_List_Node itr = front;
		str="list: ";
		while(itr != null) {
			str = str + " -> " + itr.getData();
			itr=itr.getNext();
		}
		return str;
	}
	 
	 

}
