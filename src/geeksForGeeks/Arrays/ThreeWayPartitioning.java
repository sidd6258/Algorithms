package geeksForGeeks.Arrays;

public class ThreeWayPartitioning {
	public static void threeWayPartition(int[] arr, int lowVal, int highVal)
    {
		int n=arr.length;
		int start=0,end=n-1;
		int i=0,temp=0;;
		while(i<end){
			if(arr[i]<lowVal){
				temp=arr[i];
				arr[i]=arr[start];
				arr[start]=temp;
				start++;
				i++;
			}
			else if(arr[i]>highVal){
				temp=arr[i];
				arr[i]=arr[end];
				arr[end]=temp;
				end--;
			}
			else{
				i++;
			}
		}         
    }
     
    public static void main (String[] args) 
    {
     
     
        int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
         
        threeWayPartition(arr, 10, 20);
  
        System.out.println("Modified array ");
        for (int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
     
        }    
    }
}
