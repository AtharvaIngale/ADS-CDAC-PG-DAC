//This class contains functions related to Binary Tree implementation in Queue using Linked List such as enQueue, deQueue and toString

package binary_tree_queue_using_linked_list;

public class Binary_Tree_Queue_Using_Linked_List_Functions {
	
	Binary_Tree_Queue_Using_Linked_List_Node front,rear;
	 
	//default constructor
	 public Binary_Tree_Queue_Using_Linked_List_Functions()	 {
		 front = rear = null;
	 }
	 
	 //checks for empty queue
	 public boolean isEmpty() {
		 if(front == null)
			 return true;
		 else
			 return false;		 
	 }
	 
	 
	 //insert node in Binary Tree in a queue manner using linked list
	 public void enQueue(int d)  {
		 Binary_Tree_Queue_Using_Linked_List_Node new_node = new Binary_Tree_Queue_Using_Linked_List_Node(d);
		 if(front== null) {
			 front = rear= new_node;
			 return ;
		 }
		 rear.setNext(new_node);
		 rear= new_node;
		 //System.out.println(d);
		 return ;
	 }
	 
	 //to delete the binary tree node from the front
	 public int deQueue() {
		 int d = -999;
		 if(isEmpty())
			 return d;
		 
		 d= front.getData();
		 front= front.getNext();
		 return d;
	 }

	
	 //to print the nodes on the console
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
