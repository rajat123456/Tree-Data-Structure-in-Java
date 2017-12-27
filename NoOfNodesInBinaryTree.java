// Number Of Nodes in a Binary Tree

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

class NoOfNodes
{  	
     int Noofnodes(Node root)
  	{
  		if(root==null)
  		{
  			return 0;
  		}
  		
  		else
  		{
  			//No of nodes= 1(Root Node)+NoOfNode_in_Left_Subtree+NoOfNode_in_Right_Subtree
  		  return (1+Noofnodes(root.left)+Noofnodes(root.right));
  			
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
       
      int a= new NoOfNodes().Noofnodes(first);
      
      System.out.println("No of Nodes in Given Binary Tree is "+a);
       
  	}
}