// Query on Segment Tree
// Time comp-> O(N)[building]+ O(logN)[update] + O(logN)[query]
// Space Comp-> O(2*N)


public class Main
{
	public static void main(String[] args) {
		
		int[]arr={1,2,3,4,5,6,7,8,9};
		int[]create=new int[2*arr.length];
		
		//segment tree start from index 1
		buildtree(arr,create,0,arr.length-1,1);
		
		for(int q=1;q<create.length;q++)
		System.out.print(create[q]+" ");
		
		System.out.println();
		
		//Updating value of 7th index of original array to 17
		update(arr,create,0,arr.length-1,1,7,17);
		
		for(int q=1;q<create.length;q++)
		System.out.print(create[q]+" ");
		
		System.out.println();
		
		//Quering on a Segment Tree
		System.out.println(query(create,1,0,arr.length-1,2,4));
	}
	
	static void buildtree(int[]arr, int[]create, int start, int end, int treeIndex)
	{
	   int mid=(start+end)/2; 
	    
       if(start==end)
       {
         create[treeIndex]=arr[start];
         return;
       }
       
       buildtree(arr,create,start,mid,treeIndex*2);
       buildtree(arr,create,mid+1,end,treeIndex*2+1);
       
       create[treeIndex]=create[treeIndex*2] +create[treeIndex*2+1];
	}
	
	static void update(int[]arr, int[]create, int start, int end, int treeIndex, int index, int value)
	{
	   int mid=(start+end)/2; 
	    
       if(start==end)
       {
         arr[index]=value;  
         create[treeIndex]=value;
         return;
       }
       
       
       if(index<=mid)
       update(arr,create,start,mid,treeIndex*2,index,value);
       
       else if(index>mid)
       update(arr,create,mid+1,end,treeIndex*2+1,index,value);
       
       create[treeIndex]=create[treeIndex*2] +create[treeIndex*2+1];
	}
	
	static int query(int[]create, int treeIndex,int start, int end, int left, int right)
	{
	  if(start>right || end<left)
	  return 0;
	  
	  if(start>=left && end<=right)
	  return create[treeIndex];
	  
	  else
	  {
	      int mid=(start+end)/2;
	      int ans1=query(create,treeIndex*2,start,mid,left,right);
	      int ans2=query(create,treeIndex*2+1,mid+1,end,left,right);
	      
	      return ans1+ans2;
	  }
	}
}
