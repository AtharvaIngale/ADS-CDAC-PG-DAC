package avl_tree;

import java.util.LinkedList;
import java.util.Queue;

public class Avl_Tree_Function {
	
	Avl_Tree_Node root;
	Boolean taller;
	public Avl_Tree_Node insert( Avl_Tree_Node pptr,int ikey)
	{
		if(pptr==null)	/*Base case*/
		{
			pptr = new Avl_Tree_Node();
			pptr.info = ikey;
			pptr.lchild = null;
			pptr.rchild = null;
			pptr.ht = 0;
			pptr.balance = 0;
			taller = true;
		}
		else if(ikey < pptr.info)	/*Insertion in left subtree*/
		{
			System.out.println(pptr.info);
			pptr.lchild = insert(pptr.lchild, ikey);
			if(taller==true)
			{
				pptr = insert_left_check( pptr, taller );
			}
		}
		else if(ikey > pptr.info)	/*Insertion in right subtree */
		{
			//printf(" --> %d",pptr.info);	
			pptr.rchild = insert(pptr.rchild, ikey);  
			if(taller==true)
			{
				pptr = insert_right_check(pptr, taller);
			}	
		}
		else  /*Base Case*/
		{
			System.out.println("\nDuplicate key, taller = FALSE\n");
//			System.out.println("Unwinding Phase starts");
			taller = false;
		}
		int h1 = 0;
		int h2 = 0;
		if(pptr.lchild!=null)
			h1 = pptr.lchild.ht;
		if(pptr.rchild!=null)
			h2 = pptr.rchild.ht;
		pptr.ht=(max(h1,h2));
		return(pptr);	
	}

	//Function to insert in left
	public Avl_Tree_Node insert_left_check(Avl_Tree_Node pptr, Boolean ptaller )
	{
		switch(pptr.balance)
		{
		 case 0: /* Case L_A : was balanced */  
			 System.out.println("Case L_A : was balanced now left heavy\n");
			 pptr.balance = 1;	/* now left heavy */
			break;
		 case -1: /* Case L_B: was right heavy */ 
			 System.out.println("Case L_B : was right heavy now balanced\n");
			 pptr.balance = 0;	/* now balanced */
			ptaller = false;
			//printf("taller becomes false, Stop checking\n");
			break;
		 case 1: /* Case L_C: was left heavy */   
			//printf("Case L_C : was left heavy now unbalanced, left Balancing required\n");
			System.out.println("Node "+pptr.info+"  becomes pivot node\n"); 
			pptr = insert_LeftBalance(pptr);	/* Left Balancing */
			ptaller = false;
			System.out.println("taller becomes false, Stop checking\n");
		}
		return pptr;
	}/*End of insert_left_check( )*/
	
	
	//Function to insert in right
	Avl_Tree_Node insert_right_check(Avl_Tree_Node pptr, Boolean ptaller )
	{
		switch(pptr.balance)
		{
		 case 0: /* Case R_A : was balanced */	
			System.out.println("Case R_A : was balanced now right heavy\n");
			pptr.balance = -1;	/* now right heavy */
			break;
		 case 1: /* Case R_B : was left heavy */  
			System.out.println("Case L_B : was left heavy now balanced\n");
			pptr.balance = 0;	/* now balanced */ 
			ptaller = false;
			System.out.println("taller becomes false, Stop checking\n");
			break;
		 case -1: /* Case R_C: Right heavy */   
			System.out.println("Case R_C : was right heavy now unbalanced, right Balancing required\n"); 
			System.out.println("Node " + pptr.info +" becomes pivot node\n"); 
			pptr = insert_RightBalance(pptr);	/* Right Balancing */
			ptaller = false;
			System.out.println("taller becomes false, Stop checking\n");
		}
		return pptr;
	}/*End of insert_right_check( )*/
	
	
	//Function to find max
	public static int max(int a, int b)
	{
		if(a>b) return a;  else return b;
	}
	
	//Function to insert in left to balance tree
	public Avl_Tree_Node insert_LeftBalance(Avl_Tree_Node pptr)
	{
		Avl_Tree_Node aptr, bptr;

		aptr = pptr.lchild;
		if(aptr.balance == 1)  /* Case L_C1 : Insertion in AL */ 
		{
			System.out.println("Case L_C1\n");
			pptr.balance = 0;
			aptr.balance = 0;
			pptr = RotateRight(pptr);
		}
		else		/* Case L_C2 : Insertion in AR */
		{
			bptr = aptr.rchild;
			switch(bptr.balance)
			{
			case -1:			/* Case L_C2a : Insertion in BR */   
				System.out.println("Case L_C2a\n");
				pptr.balance = 0;
				aptr.balance = 1;
				break;
			case 1:					/* Case L_C2b : Insertion in BL */
				System.out.println("Case L_C2b\n");
				pptr.balance = -1;
				aptr.balance = 0;
				break;
			case 0:					/* Case L_C2c : B is the newly inserted node */ 
				System.out.println("Case L_C2c\n");
				pptr.balance = 0;
				aptr.balance = 0;
				break;
			}
			bptr.balance = 0;
			pptr.lchild = RotateLeft(aptr);
			pptr = RotateRight(pptr);
		}
		return pptr;
	}/*End of insert_LeftBalance( )*/
    
	Avl_Tree_Node insert_RightBalance(Avl_Tree_Node pptr)
	{
		Avl_Tree_Node aptr, bptr;

		aptr = pptr.rchild;
		if(aptr.balance == -1) /* Case R_C1 : Insertion in AR */ 
		{
			System.out.println("Case R_C1\n");
			pptr.balance = 0;
			aptr.balance = 0;
			pptr = RotateLeft(pptr);
		}
		else		/* Case R_C2 : Insertion in AL */
		{
			bptr = aptr.lchild;
			switch(bptr.balance)
			{
			case -1:	/* Case R_C2a : Insertion in BR */
				System.out.println("Case R_C2a\n");
				pptr.balance = 1;  
				aptr.balance = 0;
				break;
			case 1:		/* Case R_C2b : Insertion in BL */
				System.out.println("Case R_C2b\n");
				pptr.balance = 0;
				aptr.balance = -1;
				break;
			case 0:		/* Case R_C2c : B is the newly inserted node */
				System.out.println("Case R_C2c\n");
				pptr.balance = 0;
				aptr.balance = 0;
			}
			bptr.balance = 0;
			pptr.rchild = RotateRight(aptr);
			pptr = RotateLeft(pptr);
		}
		return pptr;
	}/*End of insert_RightBalance( )*/

	
	Avl_Tree_Node RotateRight(Avl_Tree_Node pptr)
	{
		Avl_Tree_Node aptr;
		System.out.println("Rotate Right about " +pptr.info);
		aptr = pptr.lchild;	/*A is left child of P */
		pptr.lchild = aptr.rchild; /*Right child of A becomes left child of P*/  
		aptr.rchild = pptr;			/*P becomes right child of A*/
		int h1 = 0;
		int h2 = 0;
		if(pptr.lchild!=null)
			h1 = pptr.lchild.ht;
		if(pptr.rchild!=null)
			h2 = pptr.rchild.ht;
		pptr.ht = max(h1,h2)+1;
		if(aptr.lchild!=null)
			h1 = aptr.lchild.ht;
	    aptr.ht = max(h1,pptr.ht)+1;
		return aptr; /*A is the new root of the subtree initially rooted at P*/
	}/*End of RotateRight( )*/
	
	
	
	Avl_Tree_Node RotateLeft(Avl_Tree_Node pptr)
	{
		Avl_Tree_Node aptr;
		System.out.println("Rotate left about "+ pptr.info);
		aptr = pptr.rchild;	/*A is right child of P*/
		pptr.rchild = aptr.lchild; /*Left child of A becomes right child of P */
		aptr.lchild = pptr;  /*P becomes left child of A*/ 
		int h1 =0,h2= 0;
		if(pptr.rchild!=null)
			h1 = pptr.rchild.ht;
		if(pptr.lchild!=null)
			h2 = pptr.lchild.ht;
		pptr.ht = max(h1, h2) + 1;
		if(aptr.rchild!=null)
			h1 = aptr.rchild.ht;
		aptr.ht = max(h1,pptr.ht)+1;
		return aptr;  /*A is the new root of the subtree initially rooted at P*/
	}/*End of RotateLeft( )*/
	
	void level_traverse()
	{
		Avl_Tree_Node ptr=root;
		Queue <Avl_Tree_Node> q=new LinkedList<Avl_Tree_Node>();
		    if(ptr==null)
		    {
		       System.out.println("Tree Empty..");
		       return;
		    }

		    q.add(ptr);
		    while(!q.isEmpty())
		    {
		      ptr=q.remove();
		      System.out.print("  "+ptr.info);
		      if(ptr.lchild!=null)
		         q.add(ptr.lchild);
		      if(ptr.rchild!=null)
		        q.add(ptr.rchild);
		    }//end of while loop
		    System.out.print("\n");
	}

}
