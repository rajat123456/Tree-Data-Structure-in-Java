// Full Nodes in a Binary Tree

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

class FullNodes
{
	//to keep track of number of leaves in tree
	static int leaf=0;
	
     int fullnodes(Node root)
  	{
    	 //if there is no node
  		if(root==null)
  		{
  			return 0;
  		}
  	
  		//if leaf node 
  		else if(root.left==null && root.right==null)
  		{
  			return 0;
  		}
  		
  		else
  			
  			return(root.left==null || root.right==null)? fullnodes(root.left)+fullnodes(root.right): 1+fullnodes(root.left)+fullnodes(root.right);
  			
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
       
      int fn= new FullNodes().fullnodes(first);
      
      System.out.println("No of Full Nodes in Given Binary Tree is "+fn);

      
      

  	}
}