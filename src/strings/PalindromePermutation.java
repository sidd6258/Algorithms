package strings;

import java.util.HashMap;
import java.util.Map.Entry;

public class PalindromePermutation {

	public static void main(String[] args) {
		String s="tact coa";
		char[] c =s.toCharArray();
		boolean flag=false;
		int count=0;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();

		for(char ch: c){
		if(ch != ' '){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
				}
				else
				map.put(ch,1);
		}
		else
		{
			continue;
		}			
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
		    Character key = entry.getKey();
		    Integer value = entry.getValue();
		    if(value%2 != 0)
		    	count++;
		    else
		    	continue;
		}
		if(count>1)
			System.out.println("False");
		else
			System.out.println("True");

	}

}
