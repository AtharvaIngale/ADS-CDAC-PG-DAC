package binary_tree_count_level;

import java.util.LinkedList;
import java.util.Queue;

import binary_tree.Binary_Tree_Node;

public class Binary_Tree_Count_Level_Function {
	
	Binary_Tree_Node root;
	
	//Insert node level wise
		public void insert_Levelwise(int d) {
			Binary_Tree_Node new_node = new Binary_Tree_Node(d);
			if(root==null) {
				root=new_node;
				return;
			}
			Queue<Binary_Tree_Node> q = new LinkedList<Binary_Tree_Node>();
			Binary_Tree_Node iter = root;
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
	
	public int level_Count() {
		Binary_Tree_Node iter = root;
		if(root==null) {
			return -1;
		}
		int cnt=-1;   //-1 because no need to subtract -1 at last
		Queue<Binary_Tree_Node> q = new LinkedList<Binary_Tree_Node>();
		Binary_Tree_Node dummy = new Binary_Tree_Node(-99);
		q.add(iter);
		q.add(dummy);
		while(!q.isEmpty()) {
			iter=q.remove();
			if(iter.getData()==-99) {
				cnt++;
				q.add(dummy);
				iter=q.remove();
			}
			if(iter.getLeft()!=null) {
				q.add(iter.getLeft());
			}
			if(iter.getRight()!=null) {
				q.add(iter.getRight());
			}
		}
		return cnt;
	}

}
