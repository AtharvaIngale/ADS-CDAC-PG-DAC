package binary_search_tree;

public class Binary_Search_Tree_Node {
	
	private int data;
	private Binary_Search_Tree_Node right, left;
	
	public Binary_Search_Tree_Node() {
		data=0;
		right=left=null;
	}
	
	public Binary_Search_Tree_Node(int d) {
		data=d;
		right=left=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int d) {
		data = d;
	}

	public Binary_Search_Tree_Node getRight() {
		return right;
	}

	public void setRight(Binary_Search_Tree_Node r) {
		right = r;
	}

	public Binary_Search_Tree_Node getLeft() {
		return left;
	}

	public void setLeft(Binary_Search_Tree_Node l) {
		left = l;
	}
	
	

}
