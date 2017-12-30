// Non Full Nodes in a Binary Tree

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

class NonFullNodes
{
	//to keep track of number of leaves in tree
	static int leaf=0;
	
     int nonfullnodes(Node root)
  	{
    	 //if there is no node
  		if(root==null)
  		{
  			return 0;
  		}
  	
  		//leaf is a non full node 
  		else if(root.left==null && root.right==null)
  		{
  			return 1;
  		}
  		
  		else
  			
  			// 1 is added to that node which has only 1 child(bcz that's only non full node)
  			return(root.left==null || root.right==null)? 1+nonfullnodes(root.left)+nonfullnodes(root.right):nonfullnodes(root.left)+nonfullnodes(root.right);
  			
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
       
      int nfn= new NonFullNodes().nonfullnodes(first);
      
      System.out.println("No of Non Full Nodes in Given Binary Tree is "+nfn);

      
      

  	}
}