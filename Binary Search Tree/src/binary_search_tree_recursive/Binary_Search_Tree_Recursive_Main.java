package binary_search_tree_recursive;

public class Binary_Search_Tree_Recursive_Main {
	
	public static void main(String[] args) {
		Binary_Search_Tree_Recursive_Function bst1 = new Binary_Search_Tree_Recursive_Function();
		
		bst1.insert(10);
		bst1.insert(20);
		bst1.insert(30);
		bst1.insert(40);
		bst1.insert(50);
		bst1.insert(60);
		
		System.out.println(bst1);
	}

}
