package avl_tree;

public class Avl_Tree_Main {
	
	public static void main(String[] args) {
		
		Avl_Tree_Function obj = new Avl_Tree_Function();
		obj.root = obj.insert(obj.root,58);
		obj.root = obj.insert(obj.root,62);
		System.out.println("Balance = " + obj.root.balance);
		obj.root = obj.insert(obj.root,56);
		System.out.println("Balance = " + obj.root.balance);
		obj.root = obj.insert(obj.root,54);
		obj.root = obj.insert(obj.root,51);
		System.out.println(obj.root.ht);
		obj.level_traverse();
		System.out.println(obj.root.balance);
	}

}
