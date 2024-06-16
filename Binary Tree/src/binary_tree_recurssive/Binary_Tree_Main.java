package binary_tree_recurssive;

public class Binary_Tree_Main {
	
	public static void main(String[] args) {
		Binary_Tree_Functions bt = new Binary_Tree_Functions();
		
		int data;
		
		bt.setRoot(bt.createNode(10));;
		bt.getRoot().setLeft(bt.createNode(20));
		bt.getRoot().setRight(bt.createNode(30));
		bt.getRoot().getLeft().setLeft(bt.createNode(40));
		bt.getRoot().getLeft().getLeft().setRight(bt.createNode(50));
		bt.getRoot().getRight().setRight(bt.createNode(60));
		bt.getRoot().getRight().getRight().setLeft(bt.createNode(70));
		
//		System.out.println(" ");
		System.out.println("Pre Order Traversal");
		bt.preOrder();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("In Order Traversal");
		bt.inOrderTravasal(bt.getRoot());
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Post Order Traversal");
		bt.postOrderTravasal(bt.getRoot());
	}

}
