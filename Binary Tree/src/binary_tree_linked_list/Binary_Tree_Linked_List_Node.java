package binary_tree_linked_list;

import binary_tree_recurssive.Binary_Tree_Node;

public class Binary_Tree_Linked_List_Node {
	
	private Binary_Tree_Node data;
	private Binary_Tree_Linked_List_Node next;
	
	
	public Binary_Tree_Linked_List_Node()
	{
		data=null;
		next=null;
	}
	
	
	public Binary_Tree_Linked_List_Node(Binary_Tree_Node d)
	{
		data = d;
		next=null;
	}
	
	
	public Binary_Tree_Node getData()
	{
		return data;
	}
	
	public Binary_Tree_Linked_List_Node getnext()
	{
		return next;
	}
	
	public void setData(Binary_Tree_Node d)
	{
		data = d;
	}
	
	public void setNext(Binary_Tree_Linked_List_Node n)
	{
		next = n;
	}

}
