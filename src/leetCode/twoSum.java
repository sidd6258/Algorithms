package leetCode;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	    
	    public static void main(String[] args){
	    	int nums[]={3,2,4};
	    	int target=6;
	    	int ans[]=twoSum(nums,target);
	    	System.out.print("[");
	    	for(int i=0;i<ans.length;i++){
	    		System.out.print(" "+ans[i]+" ");
	    	}
	    	System.out.println("]");
	    }

}
