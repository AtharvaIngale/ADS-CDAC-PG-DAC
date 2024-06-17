package binary_tree_levelwise;


public class Binary_Tree_Levelwise_Node {
	
	private int data;
	private Binary_Tree_Levelwise_Node left, right;
	
	public Binary_Tree_Levelwise_Node() {
		data=0;
		left=right=null;
	}
	
	public Binary_Tree_Levelwise_Node(int d) {
		data=d;
		left=right=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Binary_Tree_Levelwise_Node getLeft() {
		return left;
	}

	public void setLeft(Binary_Tree_Levelwise_Node left) {
		this.left = left;
	}

	public Binary_Tree_Levelwise_Node getRight() {
		return right;
	}

	public void setRight(Binary_Tree_Levelwise_Node right) {
		this.right = right;
	}

}
