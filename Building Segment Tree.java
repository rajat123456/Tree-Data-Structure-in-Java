// Building Segment Tree->
// Time comp-> O(N), where 'n' is length of original array
// Space Comp->O(2*N), where 'n' is length of original array

public class Main
{
	public static void main(String[] args) {
		
		int[]arr={1,2,3,4,5,6,7,8,9};
		int[]create=new int[2*arr.length];
		
		//segment tree start from index 1
		buildtree(arr,create,0,arr.length-1,1);
		
		for(int q=1;q<create.length;q++)
		System.out.print(create[q]+" ");
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
}
