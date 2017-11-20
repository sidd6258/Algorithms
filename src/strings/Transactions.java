package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Transactions {
	
	   static Map<String, String> map;

	    public static void main(String[] args) {
	    	
	    	Map<String,String> map1=new HashMap<>();
	    	
	    	
	        System.out.println(getTransactionState("AX1B34"));
	        System.out.println(getTransactionState("AX2H75"));
	        System.out.println(getTransactionState("AX78B3"));
	        System.out.println(getTransactionState("AX65N3"));
	        System.out.println(getTransactionState("AX1B34"));
	        System.out.println(getTransactionState("AX78B3"));
	    }

	    private static String getTransactionState(String input) {
	    	String txidState=getStateFromDB(input);
	    	if(txidState !=null){
	    		return txidState;
	    	}
	    	else{
	    		Transactions.map.put(input, "SUCCESS");
	    	    txidState=Transactions.map.get(input);
	    	    return txidState;
	    	}	     	                 
	    }
	    
	    public static String getStateFromDB(String tid){
	    	Transactions.map.put("AX1B34", "SUCCESS");
	    	Transactions.map.put("AX2H75", "FAIL");
	    	Transactions.map.put("AX78B3", "PENDING");
	    	Transactions.map.put("AX65N3", "SUCCESS");	
	    	return Transactions.map.get(tid);
	    }
}	

