package leetCode;

import java.util.ArrayList;

public class ReverseInteger {
	    public static int reverse(int x) {
	        String s=String.valueOf(x);
	        char[] arr=s.toCharArray();
	        int size=arr.length;
	        String fString="";
	        ArrayList<Character> f=new ArrayList<>();
	        for(int i=arr.length;i>0;i--) {
	        		if(arr[size-i]=='-') {
	        			f.add('-');
	        		}
	        		if(arr[i-1]=='-') continue;
	        		if((f.isEmpty() || (f.contains('-') && f.size()==1)) && arr[i-1]=='0') continue;
	        		else f.add(arr[i-1]);
	        }	
	        for(char c:f) {
	        	 fString +=String.valueOf(c);
	        }
	        try {
	        		return Integer.parseInt(fString);
	        }
	        catch (NumberFormatException e) {
	        	return 0;
			}
			
	    }
	    public static void main(String[] args) {
	    	int [][] myArray= {{1,2},{3,4}};
	    	System.out.println(reverse(1534236469));
	    }
}
