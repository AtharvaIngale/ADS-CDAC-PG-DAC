package binary_tree_recurssive;

import binary_tree_queue_using_linked_list.Binary_Tree_Queue_Using_Linked_List_Functions;
import binary_tree_queue_using_linked_list.Binary_Tree_Queue_Using_Linked_List_Node;

public class Binary_Tree_Functions {
	
	private Binary_Tree_Node root;
	Binary_Tree_Queue_Using_Linked_List_Node front, rear;
	
	public Binary_Tree_Functions() {
		root=null;
	}

	public Binary_Tree_Node getRoot() {
		return root;
	}

	public void setRoot(Binary_Tree_Node root) {
		this.root = root;
	}
	
	public Binary_Tree_Node createNode(int d) {
		return new Binary_Tree_Node(d);
	}
	
	//Wrapper function for travsing the Binary tree in Pre Order
	public void preOrder() {
		preOrderTravasal(root);
	}
	
	//Function for travsing the Binary tree in Pre Order
	public void preOrderTravasal(Binary_Tree_Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.getData() + " -> ");
		preOrderTravasal(root.getLeft());
		preOrderTravasal(root.getRight());
	}
	
	//Function for travsing the Binary tree in In Order
	public void inOrderTravasal(Binary_Tree_Node root) {
		if(root==null) {
			return;
		}
		inOrderTravasal(root.getLeft());
		System.out.print(root.getData() + " -> ");
		inOrderTravasal(root.getRight());
	}
	
	//Function for travsing the Binary tree in Post Order
	public void postOrderTravasal(Binary_Tree_Node root) {
		if(root==null) {
			return;
		}
		postOrderTravasal(root.getLeft());
		postOrderTravasal(root.getRight());
		System.out.print(root.getData() + " -> ");
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
	public Binary_Tree_Node deQueue() {
		Binary_Tree_Node d = null;
		if(isEmpty())
			return d;
		d= front.getData();
		front= front.getNext();
		return d;
	}
		 
		 
	//Levelwise insertion of nodes in binary tree
	public void insert_levelwise(int d)	{
		Binary_Tree_Node new_node = new Binary_Tree_Node(d);
		if(root == null) {
			root = new_node;
			return;
		}		
		Binary_Tree_Node iter = root;
		Binary_Tree_Functions  q = new Binary_Tree_Functions();
		q.enQueue(iter);		
		while(!q.isEmpty())	{
			iter = q.deQueue();			
			if(iter.getLeft()==null) {
				iter.setLeft(new_node);
				return;b
			}
			else {
				q.enQueue(iter.getLeft());
			}
			if(iter.getRight()==null) {
				iter.setRight(new_node);
				return;
			}
			else {
				q.enQueue(iter.getRight());
			}
		}
	}

}
