package binary_tree;

public class BTListNode {
	
	private BTNode data;
	private BTListNode next;
	
	
	public BTListNode()
	{
		data=null;
		next=null;
	}
	
	
	public BTListNode(BTNode d)
	{
		data = d;
		next=null;
	}
	
	
	public BTNode getData()
	{
		return data;
	}
	
	public BTListNode getnext()
	{
		return next;
	}
	
	public void setData(BTNode d)
	{
		data = d;
	}
	
	public void setNext(BTListNode n)
	{
		next = n;
	}

}
