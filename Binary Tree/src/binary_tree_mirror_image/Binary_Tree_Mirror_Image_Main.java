package binary_tree_mirror_image;

public class Binary_Tree_Mirror_Image_Main {
	
	public static void main(String[] args) {
		
		Binary_Tree_Mirror_Image_Function b1 = new Binary_Tree_Mirror_Image_Function();
		
		b1.insert_Levelwise(10);
		b1.insert_Levelwise(20);
		b1.insert_Levelwise(30);
		b1.insert_Levelwise(40);
		b1.insert_Levelwise(50);
		
		System.out.println("Before Mirror Image");
		b1.display_Levelwise();
		
		System.out.println(" ");
		System.out.println("After Mirror Image");
		b1.mirror_Image();
		b1.display_Levelwise();
	}

}
