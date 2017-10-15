package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	void maxDiff(int arr[], int arr_size) 
    {
        int max_diff = arr[1] - arr[0];
        int i, j;
        int smallerIndex=0,biggerIndex=0;
        for (i = 0; i < arr_size; i++) 
        {
            for (j = i + 1; j < arr_size; j++) 
            {
                if (arr[j] - arr[i] > max_diff){
                    max_diff = arr[j] - arr[i];
                    smallerIndex=i+1;
                    biggerIndex=j+1;
                }
            }
        }
        System.out.println("Max profit is when user will buy on day "+smallerIndex+" with price "+ arr[smallerIndex-1]+ " and sell"
        		+ " on day "+biggerIndex+" with price "+ arr[biggerIndex-1] + " and will profit of "+max_diff);
        
    }
 
    /* Driver program to test above functions */
    public static void main(String[] args) 
    {
        Solution maxdif = new Solution();
        int arr[] = {100,99, 102, 103, 105};
        maxdif.maxDiff(arr, 5);
    }
}
