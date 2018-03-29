package leetCode;

//Find element in a sorted array whose frequency is greater than or equal to n/2.
//Given a sorted array of length n, find the number in array that appears more than or equal to n/2 times. 
//It is given that such element always exists.
//Input : 3 4 5 5 5 

public class Test1 {
	
	public int findNumber(int arr[],int n) {
		return arr[n/2];
	}

	public static void main(String[] args) {
		Test1 test1=new Test1();
		int arr[] = {3,4,5,5,5};
		int n=arr.length;
		System.out.println(test1.findNumber(arr, n));
	}
}
