//Height of a Binary Tree

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

class HeightOfBinaryTree
{
     int height(Node root)
  	{
    	 //if there is no node
  		if(root==null)
  		{
  			return 0;
  		}

  		else if(root.left==null && root.right==null)
  		{
  			return 0;
  		}
  		
  		else
  		{
  			int left_height=height(root.left);
  		    int right_height=height(root.right);
  		    
  		    return 1+((left_height>right_height)? left_height:right_height);
  		
  		}
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
       Node eight=new Node(80);
       
       first.left=second;
       first.right=third;
       second.left=fourth;
       second.right=null;
       third.left=fifth;
       third.right=null;
       fourth.left=null;
       fourth.right=sixth;
       fifth.left=seventh;
       fifth.right=eight;
       sixth.left=null;
       sixth.right=null;
       seventh.left=null;
       seventh.right=null;
       eight.left=null;
       eight.right=null;
       
      int height= new HeightOfBinaryTree().height(first);
      
      System.out.println("Height of tree is "+height);
      
      
  	}
}