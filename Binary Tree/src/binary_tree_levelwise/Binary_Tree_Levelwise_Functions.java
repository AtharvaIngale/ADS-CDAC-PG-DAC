package binary_tree_levelwise;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree_Levelwise_Functions {
	
	private Binary_Tree_Levelwise_Node root;
	
	public Binary_Tree_Levelwise_Functions() {
		root = null;
	}
	
	//display the level wise nodes of binary tree
	public void display_Levelwise() {
		Binary_Tree_Levelwise_Node iter = root;
		if(root==null) {
			return;
		}
		Queue<Binary_Tree_Levelwise_Node> q = new LinkedList<Binary_Tree_Levelwise_Node>();
		q.add(iter);
		while(!q.isEmpty()) {
			iter=q.remove();
			System.out.println(" " + iter.getData());
			if(iter.getLeft()!=null) {
				q.add(iter.getLeft());
			}
			if(iter.getRight()!=null) {
				q.add(iter.getRight());
			}
		}
	}
	
	
	//Insert node level wise
	public void insert_Levelwise(int d) {
		Binary_Tree_Levelwise_Node new_node = new Binary_Tree_Levelwise_Node(d);
		if(root==null) {
			root=new_node;
			return;
		}
		Queue<Binary_Tree_Levelwise_Node> q = new LinkedList<Binary_Tree_Levelwise_Node>();
		Binary_Tree_Levelwise_Node iter = root;
		q.add(iter);
		while(!q.isEmpty()) {
			iter=q.remove();
			if(iter.getLeft()==null) {
				iter.setLeft(new_node);
				return;
			}
			else {
				q.add(iter.getLeft());
			}
			if(iter.getRight()==null) {
				iter.setRight(new_node);
				return;
			}
			else {
				q.add(iter.getRight());
			}
		}
	}

}
