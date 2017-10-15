package geeksForGeeks.Arrays;

public class ReplaceNextGreatest {
	    /* Function to replace every element with the
	       next greatest element */
	    static void nextGreatest(int arr[])
	    {
	    	
	    	for(int i=0;i<arr.length-1;i++){
	    		int max=0;
	    		for(int j=i+1;j<arr.length;j++){	    			
	    			if(arr[j]>max){
	    				max=arr[j];
	    			}
	    		}
	    		arr[i]=max;
	    	}
	    	arr[arr.length-1]=-1;
	    }
	 
	    /* A utility Function that prints an array */
	    static void printArray(int arr[])
	    {
	        for (int i=0; i < arr.length; i++)
	        System.out.print(arr[i]+" ");
	    }
	 
	    public static void main (String[] args)
	    {
	        int arr[] = {16, 17, 4, 3, 5, 2};
	        nextGreatest (arr);
	        System.out.println("The modified array:");
	        printArray (arr);
	    }
	
}
