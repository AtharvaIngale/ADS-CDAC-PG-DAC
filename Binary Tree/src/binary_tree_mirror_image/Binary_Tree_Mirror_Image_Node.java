package binary_tree_mirror_image;

public class Binary_Tree_Mirror_Image_Node {
	
	private int data;
	private Binary_Tree_Mirror_Image_Node left, right;
	
	public Binary_Tree_Mirror_Image_Node() {
		data=0;
		left=right=null;
	}
	
	public Binary_Tree_Mirror_Image_Node(int d) {
		data=d;
		left=right=null;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int d) {
		data=d;
	}
	
	public Binary_Tree_Mirror_Image_Node getLeft() {
		return left;
	}
	
	public void setLeft(Binary_Tree_Mirror_Image_Node l) {
		left=l;
	}
	
	public Binary_Tree_Mirror_Image_Node getRight() {
		return right;
	}
	
	public void setRight(Binary_Tree_Mirror_Image_Node r) {
		right=r;
	}

}
