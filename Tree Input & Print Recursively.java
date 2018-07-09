********************************Taking Tree Input from User and Printing it Recursively************************************************

import java.util.*;
class TreeNode<T>
{
    T data;
    ArrayList<TreeNode<T>>children;
    
    public TreeNode(T data)
    {
        this.data=data;
        children=new ArrayList();
    }
}

public class Main
{
    
    static TreeNode takeInput(Scanner sc)
    {
      System.out.println("Enter Root Data ");
      int rootdata=sc.nextInt();
      
      TreeNode<Integer>root=new TreeNode(rootdata);
      
      System.out.println("Enter Root's Number of Children ");
      int childrens=sc.nextInt();
      
      for(int i=0;i<childrens;i++)
      {
        TreeNode rooter=takeInput(sc);
        root.children.add(rooter);
      }
      
      return root;   
    }
    
    static void print(TreeNode<Integer>root)
    {
        String s=root.data+":";
        
        for(int i=0;i<root.children.size();i++)
        {
            if(i!=root.children.size()-1)
            s+=root.children.get(i).data+",";
            
            else
            s+=root.children.get(i).data;
        }
        
        System.out.println(s);
        
        for(int i=0;i<root.children.size();i++)
        {
            print(root.children.get(i));
        }
    }
    
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	TreeNode root=takeInput(sc);
	
	print(root);
	
  }
}
