package binary_tree;

public class BTQueueLL {
	BTListNode front,rear;
	 
	 public BTQueueLL()
	 {
		 front = rear = null;
	 }
	 
	 public boolean isEmpty()
	 {
		 if(front == null)
			 return true;
		 else
			 return false;
		 
		 
	 }
	 
	 
	 
	 public void enQueue(BTNode d)
	 {
		 BTListNode new_node = new BTListNode(d);
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
	 
	 
	 public BTNode deQueue()
	 {
		 BTNode d = null;
		 if(isEmpty())
			 return d;
		 
		 d= front.getData();
		 front= front.getnext();
		 return d;
		 
	 }
	

}
