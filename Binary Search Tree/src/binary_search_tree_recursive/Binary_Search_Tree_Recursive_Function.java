package binary_search_tree_recursive;
public class Binary_Search_Tree_Recursive_Function {
	
	private Binary_Search_Tree_Recursive_Node root;
	
	//
	public void insert(int d) {
		root=insert_Rec(root, d);
	}
	
	private Binary_Search_Tree_Recursive_Node insert_Rec(Binary_Search_Tree_Recursive_Node r, int d) {
		if(r==null) {
			r=new Binary_Search_Tree_Recursive_Node(d);
		}
		else if(d < r.getData()) {
			r.setLeft(insert_Rec(r.getLeft(), d));
		}
		else if(d > r.getData()) {
			r.setRight(insert_Rec(r.getRight(), d));
		}
		else {
			System.out.println("Duplicate data...");
		}
		return r;
	}
	
	private int find_Height(Binary_Search_Tree_Recursive_Node r) {
		int h_left, h_right;
		if(r==null) {
			return 0;
		}
		h_left = find_Height(r.getLeft());
		h_right = find_Height(r.getRight());
		if(h_left > h_right) {
			return 1+h_left;
		}
		else {
			return 1+h_right;
		}
	}
	
	
	
}
