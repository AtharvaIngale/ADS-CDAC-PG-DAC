package binary_tree_identical;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree_Identical_Function {
	
	Binary_Tree_Identical_Node root;
	
	
	public Binary_Tree_Identical_Node getRoot() {
		return root;
	}

	public void setRoot(Binary_Tree_Identical_Node r) {
		root = r;
	}

	//Insert node level wise
	public void insert_Levelwise(int d) {
		Binary_Tree_Identical_Node new_node = new Binary_Tree_Identical_Node(d);
		if(root==null) {
			root=new_node;
			return;
		}
		Queue<Binary_Tree_Identical_Node> q = new LinkedList<Binary_Tree_Identical_Node>();
		Binary_Tree_Identical_Node iter = root;
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
	
	//checks weather the two binary tree are identical or not
	public static boolean is_Identical(Binary_Tree_Identical_Function t1, Binary_Tree_Identical_Function t2) {
		if((t1.getRoot()==null) || (t2.getRoot()==null)) {
			return false;
		}
		Binary_Tree_Identical_Node iter1 = t1.getRoot();
		Binary_Tree_Identical_Node iter2 = t2.getRoot();
		Queue<Binary_Tree_Identical_Node> q1 = new LinkedList<Binary_Tree_Identical_Node>();
		Queue<Binary_Tree_Identical_Node> q2 = new LinkedList<Binary_Tree_Identical_Node>();
		q1.add(iter1);
		q2.add(iter2);
		while((!q1.isEmpty()) && (!q2.isEmpty())) {
			iter1 = q1.remove();
			iter2 = q2.remove();
			if(iter1.getData() != iter2.getData()) {
				return false;
			}
			if(iter1.getLeft() != null) {
				q1.add(iter1.getLeft());
			}
			if(iter1.getRight() != null) {
				q1.add(iter1.getRight());
			}
			if(iter2.getLeft() != null) {
				q2.add(iter2.getLeft());
			}
			if(iter2.getRight() != null) {
				q2.add(iter2.getRight());
			}
		}
		if(q1.isEmpty() && q2.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

}
