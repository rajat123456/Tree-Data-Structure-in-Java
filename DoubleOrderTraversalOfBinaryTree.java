// DOUBLE ORDER Traversal of a Binary Tree(Every node printed 2 times)

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

class DoubleOrderTraversal
{
  	void doubleorder(Node root)
  	{
  		if(root==null)
  		{
  			return;
  		}
  		
  		//Here ROOT means printing the data
  		//For DOUBLE ORDER we have-> ROOT, LEFT_SUBTREE, ROOT, RIGHT_SUBTREE
  		System.out.print(root.data+" ");
  		doubleorder(root.left);
  		System.out.print(root.data+" ");
  		doubleorder(root.right);
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
       
       new DoubleOrderTraversal().doubleorder(first);
       
  	}
}