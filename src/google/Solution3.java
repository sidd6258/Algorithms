package google;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
	public static void main(String []args){
		
	int count=0;
	
	List<Integer> l1=new ArrayList<Integer>();
	l1.add(1);
	l1.add(0);
	for(Integer i:l1)
	for(Integer j:l1)
	for(Integer k:l1)
	for(Integer l:l1)
	{
		System.out.printf("%d%d%d%d\n",i,j,k,l);
		count++;
	}
}
}
