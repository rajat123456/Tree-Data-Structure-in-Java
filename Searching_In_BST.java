package freshly;
//Search a Node in BST

class BST 
{
	static int count=0;
	static int flag=0;
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
  
  void search(Node root,int key)
  {
	  if(root==null)
	  {
		  return;
	  }
	  
	  else if(root.data==key)
		  flag=1;
	  
	  else if(root.data>key)
	  {
		  search(root.left,key);
	  }
	  
	  else
	  search(root.right,key);
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
	 System.out.println();
	 int value=11;
	 b.search(root, value);
	 if(flag==1)
	 System.out.print(value+" is present in the given BST");
	 else
     System.out.print(value+" is not present in the given BST");
}
}