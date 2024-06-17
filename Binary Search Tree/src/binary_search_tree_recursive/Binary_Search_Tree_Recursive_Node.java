package binary_search_tree_recursive;

public class Binary_Search_Tree_Recursive_Node {
	
	private int data;
	private Binary_Search_Tree_Recursive_Node left, right;
	
	public Binary_Search_Tree_Recursive_Node() {
		data=0;
		left=right=null;
	}
	
	public Binary_Search_Tree_Recursive_Node(int d) {
		data=d;
		left=right=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Binary_Search_Tree_Recursive_Node getLeft() {
		return left;
	}

	public void setLeft(Binary_Search_Tree_Recursive_Node left) {
		this.left = left;
	}

	public Binary_Search_Tree_Recursive_Node getRight() {
		return right;
	}

	public void setRight(Binary_Search_Tree_Recursive_Node right) {
		this.right = right;
	}
	
	

}
