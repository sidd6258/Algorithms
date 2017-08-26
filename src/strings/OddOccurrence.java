package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class OddOccurrence {
	
	

	public static void main(String[] args) {
		int[] a= {1,2,2,3,5,5,5};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int count=0;

		for(int ch: a){

		if(map.containsKey(ch)){
		map.put(ch, map.get(ch)+1);
		}
		else
		map.put(ch,1);
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
		    Integer key = entry.getKey();
		    Integer value = entry.getValue();
		    if(value%2!=0)
		    System.out.println(key+"="+value);
		}
	}

}
