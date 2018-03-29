package mutlithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
public static void main(String [] args) {
	//Map<String,String> map=new HashMap<>();
	Map<String,String> map=new ConcurrentHashMap<>();
	map.put("1", "1");
	map.put("2", "2");
	map.put("3", "3");
	
//	Iterator<String> it=map.keySet().iterator();
//	while(it.hasNext()) {
//		String key=it.next();
//		//System.out.println(map.get(key));
//		if(map.get(key).equals("2")) {
//			//map.put("1", "4");
//			map.put("4", "4");
//		}
//	}
	
	for(Entry<String,String> keySet : map.entrySet()) {
		if(keySet.getValue().equals("2")) {
			map.put("4", "4");
		}
	}
	for(String key:map.keySet()) {
		System.out.println(map.get(key));
	}
}
}
