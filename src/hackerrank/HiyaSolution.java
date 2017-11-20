package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HiyaSolution {
	public static void main(String[] args){
		
		int []g_from={1,3,4};
		int []g_to={2,4,5};
		int max=0;
		int count=0;
		boolean flag=false;
		Map<Integer,ArrayList<Integer>> hm=new ConcurrentHashMap<Integer,ArrayList<Integer>>();
		
		for(int i=0;i<g_from.length;i++){
			if(i==0){
				ArrayList<Integer> first=new ArrayList<>();
				first.add(g_from[i]);
				first.add(g_to[i]);
				hm.put(count,first);
				count++;
			}
			else{
				for(Entry<Integer,ArrayList<Integer>> hm1:hm.entrySet()){
					ArrayList<Integer> temp=hm1.getValue();
					if(temp.contains(g_from[i])&&!temp.contains(g_to[i])){
						temp.add(g_to[i]);
						hm.put(hm1.getKey(), temp);
						flag=false;
						break;
					}else if(temp.contains(g_to[i]) && !temp.contains(g_from[i])){
						temp.add(g_from[i]);
						hm.put(hm1.getKey(), temp);
						flag=false;
						break;
					}
					else if(temp.contains(g_from[i])&&temp.contains(g_to[i])){
						flag=false;
						break;
					}
					else{
						flag=true;
					}
				}
				if(flag==true){
					ArrayList<Integer> new1=new ArrayList<>();
					new1.add(g_from[i]);
					new1.add(g_to[i]);
					hm.put(count, new1);
					count++;
				}
			}
		}
		for(Entry<Integer,ArrayList<Integer>> hm1:hm.entrySet()){
			ArrayList<Integer> ar=hm1.getValue();
			if(ar.get(ar.size()-1)-ar.get(0)>max){
				max=ar.get(ar.size()-1)-ar.get(0);
			}
		}
		System.out.println(max);
	}
}
