package binary_tree_levelwise;

public class Binary_Tree_Levelwise_Main {
	
	public static void main(String[] args) {
		Binary_Tree_Levelwise_Functions btl = new Binary_Tree_Levelwise_Functions();
		
		
		btl.insert_Levelwise(10);
		btl.insert_Levelwise(20);
		btl.insert_Levelwise(30);
		btl.insert_Levelwise(40);
		btl.insert_Levelwise(50);
		btl.insert_Levelwise(60);
		btl.insert_Levelwise(70);
		btl.insert_Levelwise(80);
		
		btl.display_Levelwise();
	}

}
