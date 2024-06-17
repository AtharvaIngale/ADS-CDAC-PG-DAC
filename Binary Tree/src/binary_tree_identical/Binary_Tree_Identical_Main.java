package binary_tree_identical;

public class Binary_Tree_Identical_Main {
	
	public static void main(String[] args) {
		Binary_Tree_Identical_Function b1 = new Binary_Tree_Identical_Function();
		Binary_Tree_Identical_Function b2 = new Binary_Tree_Identical_Function();
		
		b1.insert_Levelwise(10);
		b1.insert_Levelwise(20);
		b1.insert_Levelwise(30);
		b1.insert_Levelwise(40);
		b1.insert_Levelwise(50);
		
		b2.insert_Levelwise(10);
		b2.insert_Levelwise(20);
		b2.insert_Levelwise(30);
		b2.insert_Levelwise(40);
		b2.insert_Levelwise(60);
		
		if(Binary_Tree_Identical_Function.is_Identical(b1, b2)) {
			System.out.println("Trees are identical");
		}
		else {
			System.out.println("Trees are not identical");
		}
	}

}
