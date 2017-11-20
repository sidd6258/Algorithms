package strings;

import java.util.Arrays;

public class Danal1 {

	   private String[] wordsToSort = {"watermelons", "costs", "twelve", "apple", "more", "than", "An"};

	    public static void main(String[] args) {
	        Danal1 dn=new Danal1();
	       Arrays.sort(dn.wordsToSort);
	       for(int i=0;i<dn.wordsToSort.length;i++){
	    	   System.out.println(dn.wordsToSort[i]);
	       }
	    }

}
