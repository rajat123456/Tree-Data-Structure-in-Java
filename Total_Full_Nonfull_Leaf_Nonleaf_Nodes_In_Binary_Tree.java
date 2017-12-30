//Total, Full, Non Full, Leaf, Non Leaf Nodes in a Binary Tree

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

class AllInOne
{
	//to keep track of number of leaves in tree
	static int leaf=0;
	
	//to keep track of non full nodes
	static int nfn=0;
	
     int allinone(Node root)
  	{
    	 //if there is no node
  		if(root==null)
  		{
  			return 0;
  		}
  	
  		//leaf is a non full node 
  		else if(root.left==null && root.right==null)
  		{
  			leaf++;
  			nfn++;
  			return 1;
  		}
  		
  		else
  	
  			if(root.left==null||root.right==null)
  			{
				//if any Left_Subtree or Right_Subtree is null, then it's a non full node
  				nfn++;
				
				//this below return is for counting total no of nodes in tree
  				return 1+allinone(root.left)+allinone(root.right);
  			}
  			else
  			{
  				return 1+allinone(root.left)+allinone(root.right);
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
       
      int total= new AllInOne().allinone(first);
      
      System.out.println("Total of Nodes in Given Binary Tree is "+total);
      
      System.out.println("Number of Leaf Nodes in Given Binary Tree is "+leaf);
      
      int non_leaf=total-leaf;
      
      System.out.println("Number of Non Leaf Nodes in Given Binary Tree is "+non_leaf);
      
      System.out.println("Number of Non Full Nodes in Given Binary Tree is "+nfn);
      
      int fn=total-nfn;
      
      System.out.println("Number of Full Nodes in Given Binary Tree is "+fn);
      
  	}
}
