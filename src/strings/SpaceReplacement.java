package strings;

import java.util.ArrayList;
import java.util.Iterator;

public class SpaceReplacement {

	public static void main(String[] args) {
		String s="This is Siddharth";
		char[] c=s.toCharArray();
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<c.length;i++)
		{
			if(c[i] == ' ')
			{
				arr.add(i,"%20");
			}
			else
			{
				Character c2=(Character)c[i];
				arr.add(i,c2.toString());
			}
				
		}
		for(String s2:arr)
		{
			System.out.print(s2);
		}
	}

}
