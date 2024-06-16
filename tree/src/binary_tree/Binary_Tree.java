package binary_tree;

public class Binary_Tree {
	private BTNode root;
	private Object BTQueueLL;
	
	
	public Binary_Tree()
	{
		root = null;
	}
	
	
	public void setRoot(BTNode r)
	{
		root = r;
	}
	
	public BTNode getRoot()
	{
		return root;
	}
	
	
	public BTNode CreateNode(int d)
	{
		return new BTNode(d);
	}
	
	public void PreOrder()
	{
		PreOrederTraversal(root);

	}
	
	public void Inorder()
	{
		InOrderTraversal(root);
	}
	
	public void PostOrder()
	{
		PostOrderTraversal(root);
	}
	
	
	
	public void PreOrederTraversal(BTNode r)
	{
		
		if(r==null)
			return;
		System.out.println(r.getData());
		PreOrederTraversal(r.getLeft());
		PreOrederTraversal(r.getRight());
	}
	
	
	public void InOrderTraversal(BTNode r)
	{
		if(r==null)
			return;
		
		InOrderTraversal(r.getLeft());
		System.out.println(r.getData());
		InOrderTraversal(r.getRight());
	}
	
	
	public void PostOrderTraversal(BTNode r)
	{
		if(r==null)
			return;
		
		PostOrderTraversal(r.getLeft());
		
		PostOrderTraversal(r.getRight());
		
		System.out.println(r.getData());
		
		
	}
	
	
	public void insert_levelwise(int d)
	{
		BTNode new_node = new BTNode(d);
		if(root == null)
		{
			root = new_node;
			return;
		}
		
		BTNode iter = root;
		BTQueueLL  q = new BTQueueLL();
		q.enQueue(iter);
		
		
		while(!q.isEmpty())
		{
			iter = q.deQueue();
			
			if(iter.getLeft()==null)
			{
				iter.setLeft(new_node);
				return;
			}
			else
			{
				q.enQueue(iter.getLeft());
			}
			if(iter.getRight()==null)
			{
				iter.setRight(new_node);
				return;
			}
			else
			{
				q.enQueue(iter.getRight());
			}
		}
	}

}
