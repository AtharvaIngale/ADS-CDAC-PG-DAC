package binary_tree_queue_using_linked_list;

public class Binary_Tree_Queue_Using_Linked_List_Main {
	
	public static void main(String[] args) {
		
		Binary_Tree_Queue_Using_Linked_List_Functions btqll = new Binary_Tree_Queue_Using_Linked_List_Functions();
		
		btqll.enQueue(10);
		btqll.enQueue(20);
		btqll.enQueue(30);
		btqll.enQueue(40);
		
		btqll.deQueue();
		btqll.deQueue();
		
		System.out.println(btqll);
	}

}
