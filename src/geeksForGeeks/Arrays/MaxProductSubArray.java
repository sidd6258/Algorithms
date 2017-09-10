package geeksForGeeks.Arrays;

public class MaxProductSubArray {

    // Utility functions to get minimum of two integers
    static int min (int x, int y) {return x < y? x : y; }
 
    // Utility functions to get maximum of two integers
    static int max (int x, int y) {return x > y? x : y; }
 
    /* Returns the product of max product subarray.
       Assumes that the given array always has a subarray
       with product more than 1 */
    static int maxSubarrayProduct(int arr[])
    {
    	int n=arr.length;
    	int minendinghere=1;
    	int maxendinghere=1;
    	int max_so_far=1;
    	
    	for(int i=0;i<n;i++){
    		if(arr[i]>0){
    			maxendinghere=maxendinghere*arr[i];
    			minendinghere=
    		}
    	}
    }
 
    public static void main (String[] args) {
 
        int arr[] = {1, -2, -3, 0, 7, -8, -2};
        System.out.println("Maximum Sub array product is "+
                            maxSubarrayProduct(arr));
    }
}
