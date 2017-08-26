package strings;

import java.util.HashMap;
import java.util.Map.Entry;

public class CheckPermutation {
	public static boolean isPermutation(String s,String s1)
	{
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		
		if(s.length()==s1.length())
		{
			String s2=s.concat(s1);
			char[] c=s2.toCharArray();
		for(char a:c)
		{
			if(map.containsKey(a))
			{
				map.put(a,map.get(a)+1);				
			}
			else
			{
				map.put(a,1);
			}
		}
		}
		else
		{
			return false;
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
		    Integer value = entry.getValue();
		    if(value%2!=0)
		    return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		String s="aaaa";
		String s1="aada";
		if(isPermutation(s,s1))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");			
		}

	}

}
