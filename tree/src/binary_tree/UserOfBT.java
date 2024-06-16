package binary_tree;

public class UserOfBT {
	
	public static void main(String[] args) {
		
		
		
		Binary_Tree obj = new Binary_Tree();
//		obj.setRoot(obj.CreateNode(10));
//		obj.getRoot().setLeft(obj.CreateNode(20));
//		obj.getRoot().setRight(obj.CreateNode(30));
//		obj.getRoot().getLeft().setLeft(obj.CreateNode(40));
//		
//		
//		System.out.println("\n pre-order Tree are .....");
//		obj.PreOrder();
//		
//		System.out.println("\n In-order Tree are .....");
//		obj.Inorder();
//		
//		System.out.println("\n post-order Tree are .....");
//		obj.PostOrder();
		
		
		obj.insert_levelwise(10);
		obj.insert_levelwise(20);
		obj.insert_levelwise(30);
		obj.PreOrder();
		System.out.println("\n In-order Tree are .....");
		obj.Inorder();
	}

}
