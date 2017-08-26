package geeksForGeeks.binaryTree;

public class PrintPostOrderGivenInPreOrderBT {
	
	static int search(int in[],int x,int start,int end){
		int i;
		for ( i = start; i <= end; i++)
		      if (in[i] == x)
		         return i;
		    return i;
	}
	static int preIndex = 0;
	static void printPostOrder(int in[],int pre[],int start,int end,int size){
		if(start>end)return;
		int key=pre[preIndex];
		int index= search(in,pre[preIndex++],start,end);
		
		printPostOrder(in, pre,start,index-1,size);
		printPostOrder(in, pre,index+1,end,size);
		System.out.print(key+" ");
	}
	public static void main(String args[]) 
    {
		int in[] = {4, 2, 5, 1, 3, 6};
		int pre[] =  {1, 2, 4, 5, 3, 6};
		int size= in.length;
		printPostOrder(in, pre, 0,size-1,size-1);
  
    }
}
