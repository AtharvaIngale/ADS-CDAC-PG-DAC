package binary_tree;

public class BTNode {
	
	private int Data;
	private BTNode left,right;
	
	
	public BTNode()
	{
		Data = 0;
		left = right = null;
		
	}
	
	public BTNode(int d)
	{
		Data = d;
		left = right = null;
	}
	
	public int getData()
	{
		return Data;
	}
	
	public BTNode getLeft()
	{
		return left;
	}
	
	public BTNode getRight()
	{
		return right;
	}
	
	public void setData(int d)
	{
		Data = d;
	}
	
	public void setLeft(BTNode l)
	{
		left = l;
	}
	
	public void setRight(BTNode r)
	{
		right = r;
	}

	


}
