package geeksForGeeks.binarySearchTree;

public class PrintArrayAscendingBST {
	
	static void printSorted(int a[],int start,int end){
		if(start>end)
			return;
		printSorted(a,start*2+1,end);
		System.out.print(a[start]+" ");
		printSorted(a,start*2+2,end);
	}
	
	public static void main(String[] args){
		int a[]={4,2,5,1,3};
		int size=a.length;
		printSorted(a,0,size-1);
	}
}
