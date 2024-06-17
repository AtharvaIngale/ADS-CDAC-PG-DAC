package binary_search_tree;

public class Binary_Search_Tree_Functions {
	
	private Binary_Search_Tree_Node root;
	
	public Binary_Search_Tree_Functions() {
		root = null;
	}
	
	//Non recursive function for inserting node
	public void insert_Non_Recursive(int d) {
		Binary_Search_Tree_Node new_node = new Binary_Search_Tree_Node(d);
		if(root==null) {
			root=new_node;
			return;
		}
		Binary_Search_Tree_Node par, iter;
		par = iter = root;
		while(iter!=null) {
			par = iter;
			if(d<iter.getData()) {
				iter=iter.getLeft();
			}
			else if(d>iter.getData()) {
				iter=iter.getRight();
			}
			else {
				System.out.println("Deplicate key...");
			}
		}
		if(d<par.getData()) {
			par.setLeft(new_node);
		}
		else {
			par.setRight(new_node);
		}
	}
	
	//Non recursive function for searching a node
	public Binary_Search_Tree_Node search_Non_Recursive(int d) {
		if(root==null) {
			return null;
		}
		Binary_Search_Tree_Node iter = root;
		while(iter!=null) {
			if(iter.getData()==d) {
				return iter;
			}
			if(d<iter.getData()) {
				iter=iter.getLeft();
			}
			else {
				iter=iter.getRight();
			}
		}
		System.out.println("Not found...");
		return null;
	}
	
	

}
