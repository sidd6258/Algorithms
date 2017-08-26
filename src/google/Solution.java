package google;

import java.util.*;

class Solution {
	public static void main(String[] args) {
	    int[] arr = {1,4,2,3,5};
	    int K=4;
	    List<Integer[]> res = allPairs(arr,K);
	    List<Integer> numlist=new ArrayList<Integer>();
	    for(Integer[] tmp : res) {
	    	int num=0;
	    	int j=0;
	    	for(int k=3;k>=0;k--){
	    	num=(int) (num+tmp[k]*Math.pow(10,j));
	    	j++;
	    	}
	    	numlist.add(num);
	    }
	    int max=0;
	    for(int i:numlist){
	    	if(max<i){
	    		max=i;
	    	}
	    }
	    System.out.println(max);
	    
	}
	
	static String checkString(String msg) {
        int bracketMinOpen = 0, bracketMaxOpen = 0;
        for (int i = 0; i < msg.length(); i++) {
            char crr = msg.charAt(i);
            if (crr == '(') {
            	bracketMaxOpen++;
                if (i == 0 || msg.charAt(i - 1) != ':') {
                	bracketMinOpen++;
                }
            } else if (crr == ')') {
            	bracketMinOpen = Math.max(0, bracketMinOpen - 1);
                if (i == 0 || msg.charAt(i - 1) != ':') {
                	bracketMaxOpen--;
                    if (bracketMaxOpen < 0) break;
                   }
            }
    }
     if(bracketMaxOpen >= 0 && bracketMinOpen == 0){
         return "YES";
     }
     else{
         return "NO";
     }   
	}

	private static List<Integer[]> allPairs(int [] myArray,int K) {
	    List<Integer[]> res = new ArrayList<>();
	    for (int i = 0; i < myArray.length; i++) {
	    	if((i+3)<myArray.length){
	    		Integer[] tmp = new Integer[4];
	    		tmp[0]=myArray[i];
	    		tmp[1]=myArray[i+1];
	    		tmp[2]=myArray[i+2];
	    		tmp[3]=myArray[i+3];
	    		res.add(tmp);
	    	}
	    }
	    return res;
	}
	}