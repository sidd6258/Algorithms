package geeksForGeeks.Arrays;

public class FindPairInSortedRotatedArray {
    static boolean pairInSortedRotated(int arr[], 
            int n, int x)
{
    	int i;
    	for(i=0;i<n-1;i++){
    		if(arr[i]>arr[i+1])
    			break;
    	}
    	int l=(i+1)%n;
    	int r=i;
    	
    	while(l!=r){
    		if(arr[l]+arr[r]==x){
    			System.out.println("Element 1 ="+arr[l]+" Element 2 ="+arr[r]);
    			return true;
    		}
    		if(arr[l]+arr[r]<x){
    			l=(l+1)%n;
    		}else{
    			r=(n+r-1)%n;
    		}   		
    	}
    	return false;
}

/* Driver program to test above function */
public static void main (String[] args)
{
int arr[] = {11, 15, 6, 8, 9, 10};
int sum = 16;
int n = arr.length;

if (pairInSortedRotated(arr, n, sum))
System.out.print("Array has two elements" +
     " with sum 16");
else
System.out.print("Array doesn't have two" + 
     " elements with sum 16 ");
}
}
