//Insertion In a Binary Search Tree

package Trees;

class BST_Insertion
{
	Node root;
	
	BST_Insertion()
	{
		root=null;
	}
	
	void insert(int item)
	{
		//this root should be declared on LHS to hold the reference to the Top Node of Tree
		//so that global root variable should point to the root node of tree
		root=insertrecord(root,item);
	}
	
	Node insertrecord(Node root,int item)
	{
		if(root==null)
		{
			root=new Node(item);
		}
		
		else if(item<=root.data)
		{
			root.left=insertrecord(root.left,item);
		}
		
		else
		{
			root.right=insertrecord(root.right,item);
		}
		
		//if we wnon't return the root's reference to the caller then this root pointing 
		//to the top node, but it is within this function only and the global root variable
		//still point to null, that's why it should be returned to the caller
		return root;
	}
	
	void inorder()
	{
		inorderrecursion(root);
	}
	
	void inorderrecursion(Node root)
	{
		if(root!=null)
		{
			inorderrecursion(root.left);
			System.out.println(root.data+" ");
			inorderrecursion(root.right);
		}
	}
	
class Node
{ 
  int data;
  Node left;
  Node right;
  
  public Node(int d)
  {
	  data=d;
	  left=null;
	  right=null;
  }
}
	  
  	public static void main(String...args)
   	{
  		BST_Insertion first=new BST_Insertion();
  		
  	    first.insert(10);
  	    first.insert(20);
  	    first.insert(30);
  	    first.insert(5);
  	    first.insert(7);
  	    first.insert(28);
  	  	    
  	    first.inorder();
	    
  	}
}