// INDIRECT RECURSION ON TREES(A is calling B and B is calling A)

package Trees;

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

class IndirectRecursion
{
  	void A(Node root)
  	{
  		if(root==null)
  		{
  			return;
  		}
  		
  		// A is calling function B
  		//Here ROOT means printing the data
  		//It is like PREORDER but it is not PREORDER
  		System.out.print(root.data+" ");
  		B(root.left);
  		B(root.right);
  		
  	}
  	
  	void B(Node root)
  	{
  		if(root==null)
  		{
  			return;
  		}
  		
  		
  	    // B is calling function A
  		//Here ROOT means printing the data
  		//It is like INORDER but it is not INORDER
  		A(root.left);
  		System.out.print(root.data+" ");
  		A(root.right);
  	
  	}
  	
  	
  	public static void main(String...args)
   	{
       Node first=new Node(10);
       Node second=new Node(20);
       Node third=new Node(30);
       Node fourth=new Node(40);
       Node fifth=new Node(50);
       Node sixth=new Node(60);
       Node seventh=new Node(70);
       
       first.left=second;
       first.right=third;
       second.left=fourth;
       second.right=fifth;
       third.left=sixth;
       third.right=seventh;
       fourth.left=null;
       fourth.right=null;
       fifth.left=null;
       fifth.right=null;
       sixth.left=null;
       sixth.right=null;
       seventh.left=null;
       seventh.right=null;
       
       new IndirectRecursion().A(first);
       
  	}
}