package geeksForGeeks.Arrays;

public class LargestSubArray {
	 
	    // This function Prints the starting and ending
	    // indexes of the largest subarray with equal  
	    // number of 0s and 1s. Also returns the size 
	    // of such subarray.
	    int findSubArray(int arr[], int n) 
	    {
	    	int maxSize=-1;
	    	int sum=0;
	    	int startIndex=0,endIndex=0;
	    	for(int i=0;i<n;i++){
	    		sum = (arr[i]==0)?-1:1;
	    		for(int j=i+1;j<n;j++){
	    			if(arr[j]==0){
	    				sum+=-1;
	    			}else{
	    				sum+=1;
	    			}
	    			if(sum==0 && maxSize<j-i+1){
	    				startIndex=i;
	    				maxSize=j-i+1;
	    			}
	    		}
	    	}
	    	endIndex = startIndex+maxSize-1;
	        if (maxSize == -1)
	            System.out.println("No such subarray");
	        else
	            System.out.println(startIndex+" to "+endIndex);
	 
	        return maxSize;
	    }
	 
	    /* Driver program to test the above functions */
	    public static void main(String[] args) 
	    {
	        LargestSubArray sub;
	        sub = new LargestSubArray();
	        int arr[] = {1, 0, 0, 1, 0, 1, 1};
	        int size = arr.length;
	 
	        sub.findSubArray(arr, size);
	    }
}
