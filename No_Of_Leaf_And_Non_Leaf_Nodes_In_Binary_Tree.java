// Number Of Leaves and Non Leaves in a Binary Tree

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

class NoOfLeavesAndNonLeaves
{  
	static int leaves=0;
	
     int leavandnonleav(Node root)
  	{
  		if(root==null)
  		{
  			return 0;
  		}
  		
  		else if(root.left==null && root.right==null)
  		{
  	       ++leaves;
  	       //it should be 1 and not 0 since we count the leaf node as 1 node, so it is added to parent+right node
  	       return 1;
  		}
  		
  		else
  		{
  		    //No of nodes= 1(Root Node)+NoOfNode_in_Left_Subtree+NoOfNode_in_Right_Subtree
  	        return (1+leavandnonleav(root.left)+leavandnonleav(root.right));
  			
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
       
      int totalnodes= new NoOfLeavesAndNonLeaves().leavandnonleav(first);
      
      System.out.println("No of Nodes in Given Binary Tree is "+totalnodes);
      
      System.out.println("No of Leaves in Given Binary Tree is "+leaves);
      
      //Non Leaves=Total Nodes- Leaf Nodes
      int nonleaves=totalnodes-leaves;
       
      System.out.println("No of Non Leaves in Given Binary Tree is "+nonleaves);
  	}
}