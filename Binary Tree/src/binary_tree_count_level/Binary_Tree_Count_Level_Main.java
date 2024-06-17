package binary_tree_count_level;

public class Binary_Tree_Count_Level_Main {
	
	public static void main(String[] args) {
		
		Binary_Tree_Count_Level_Function b1 = new Binary_Tree_Count_Level_Function();
		
		b1.insert_Levelwise(10);
		b1.insert_Levelwise(20);
		b1.insert_Levelwise(30);
		b1.insert_Levelwise(40);
		b1.insert_Levelwise(50);
		b1.insert_Levelwise(60);
		b1.insert_Levelwise(70);
		b1.insert_Levelwise(80);
		b1.insert_Levelwise(90);
		b1.insert_Levelwise(100);
		b1.insert_Levelwise(110);
		b1.insert_Levelwise(120);
		b1.insert_Levelwise(130);
		System.out.println("Level count= " + b1.level_Count());
	}
}
