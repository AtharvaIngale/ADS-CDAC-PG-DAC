package binary_tree_recurssive;

public class Binary_Tree_Functions {
	
	private Binary_Tree_Node root;
	
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

}
