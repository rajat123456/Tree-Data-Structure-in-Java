package freshly;
//Count Leaf Nodes in BST

class BST 
{
	static int count=0;
	static Node root;


	  BST()
	  {
		  root=null;
	  }
	  
	class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	
  void insert(int item)
  {
     root=insertelement(root,item);	  
  }
  
  Node insertelement(Node root, int data)
  {
	  if(root==null)
	  {
		  root=new Node(data);
	  }
	  
	  else if(data>root.data)
	  {
		  root.right=insertelement(root.right,data);
	  }
	  
	  else
		  root.left=insertelement(root.left,data);
	  
	  return root;
  }
  
  int leafnodes(Node root)
  {
	  if(root==null)
	  {
		  return 0;
	  }
	  
	  else if(root.left==null&&root.right==null)
	  {
		  count++;
		  return 0;
	  }
	  
	  else
	  {
	  int left=leafnodes(root.left);
	  int right=leafnodes(root.right);
	  return 0;
	  }
		  
  }
  
  
  public static void main(String[]args)
{
	  BST b=new BST();
	  b.insert(9);
	  b.insert(11);
	  b.insert(4);
	  b.insert(7);
	  b.insert(2);
	  b.insert(6);
	  b.insert(5);
	  
	 b.leafnodes(root);
	 System.out.print("Leaf Nodes in Given BST is/are "+count);
}
}