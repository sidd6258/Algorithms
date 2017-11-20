package google;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Solution2 {
    // ... helper functions here

    // maximize function
    private static String maximize24Hour(String s2,int digits) {
        if (digits < 1000 || digits >= 10000) {
            return "invalid input";
        }

        // get all possibles and find the biggest
        int max = -1;
        List<Integer> singleDigits = getDigits(digits);
        List<String> allPossibles = getPermutations(singleDigits);
        List<String> allPossiblesTime=new ArrayList<>();
        List<Integer> sortedAllPossibles= new ArrayList<>();
        for (String timeStr : allPossibles) {
        	int timeInt = Integer.parseInt(timeStr);
        	sortedAllPossibles.add(timeInt);
        }
        Collections.sort(sortedAllPossibles);
        for (Integer timeInt : sortedAllPossibles) {
            
            if(isValidTime(timeInt)){
            	if(Integer.toString(timeInt).toCharArray().length==4)
            	allPossiblesTime.add(Integer.toString(timeInt));
            }
            if (isValidTime(timeInt) && timeInt > max) {
                max = timeInt;
            }
        }
        List<String> newList = new ArrayList<String>(new LinkedHashSet<String>(allPossiblesTime));

        // If none is valid
        if (max < 0) {
            return "cannot find any valid time";
        }
        
        
        boolean found=false;
        String ans="";
        int count=0;
        for(String i:newList){
        	count++;
        	if(count==(newList.size()-1)){
        		ans=newList.get(0);
        		break;
        	}
        	if(found==true){
        		ans=i;
        		break;
        	}
        	if(i.equals(s2)){
        		found=true;
        	}
        }
        char[] arr=ans.toCharArray();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<arr.length;i++){
        	if(i==2){
        		sb.append(":");
        		sb.append(arr[i]);
        	}
        	else{
        		sb.append(arr[i]);
        	}
        }
        
        // Convert int to time
        return sb.toString();
    }

    public static void main(String[] args) {
    	String s="21:56";
    	String s2 =s.replaceAll(":", "");    	
        System.out.println(maximize24Hour(s2,Integer.parseInt(s2)));
    }
    
   private static boolean isValidTime(int time) {
       int hour = time / 100;
       int min = time % 100;
       return hour <= 23 && min <= 59;
   }

   /**
    * Generate all possible numbers from input
    *
    * For example: inputs {1, 2} gives {12, 21}
    * For example: inputs {1, 2, 3} gives {123, 132, 213, 231, 312, 321}
    *
    * @param inputs Input digits
    * @return all possibles
    */
   private static List<String> getPermutations(List<Integer> inputs) {
		
		List<String> l1=new ArrayList<String>();

		for(Integer i:inputs)
		for(Integer j:inputs)
		for(Integer k:inputs)
		for(Integer l:inputs)
		{
			String s=Integer.toString(i)+Integer.toString(j)+Integer.toString(k)+Integer.toString(l);
			l1.add(s);			
		}
       return l1;
   }

   private static List<Integer> getDigits(int digits) {
       List<Integer> singleDigits = new ArrayList<>();
       while (digits > 0) {
           singleDigits.add(digits%10);
           digits /= 10;
       }
       return singleDigits;
   }
}
