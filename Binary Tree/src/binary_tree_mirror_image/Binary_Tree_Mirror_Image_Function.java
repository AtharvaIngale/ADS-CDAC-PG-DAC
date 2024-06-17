package binary_tree_mirror_image;

import java.util.LinkedList;
import java.util.Queue;

import binary_tree_levelwise.Binary_Tree_Levelwise_Node;

public class Binary_Tree_Mirror_Image_Function {
	
	Binary_Tree_Mirror_Image_Node root;
	
	//Insert node level wise
		public void insert_Levelwise(int d) {
			Binary_Tree_Mirror_Image_Node new_node = new Binary_Tree_Mirror_Image_Node(d);
			if(root==null) {
				root=new_node;
				return;
			}
			Queue<Binary_Tree_Mirror_Image_Node> q = new LinkedList<Binary_Tree_Mirror_Image_Node>();
			Binary_Tree_Mirror_Image_Node iter = root;
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
		
		
		//swaps the left node with right node and right node with left node
		private void swap(Binary_Tree_Mirror_Image_Node p) {
			Binary_Tree_Mirror_Image_Node temp;
			temp = p.getLeft();
			p.setLeft(p.getRight());
			p.setRight(temp);
		}
		
		
		//creates mirror image of the existing tree
		public void mirror_Image() {
			Binary_Tree_Mirror_Image_Node iter = root;
			if(root==null) {
				return;
			}
			Queue<Binary_Tree_Mirror_Image_Node> q = new LinkedList<Binary_Tree_Mirror_Image_Node>();
			q.add(iter);
			while(!q.isEmpty()) {
				iter=q.remove();
				swap(iter);
				if(iter.getLeft()!=null) {
					q.add(iter.getLeft());
				}
				if(iter.getRight()!=null) {
					q.add(iter.getRight());
				}
			}
			return;
		}
		
		//display the level wise nodes of binary tree
		public void display_Levelwise() {
			Binary_Tree_Mirror_Image_Node iter = root;
			if(root==null) {
				return;
			}
			Queue<Binary_Tree_Mirror_Image_Node> q = new LinkedList<Binary_Tree_Mirror_Image_Node>();
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

}
