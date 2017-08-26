package hackerrank;

import java.util.Comparator;

public class Checker implements Comparator {
	

	@Override
	public int compare(Object o1, Object o2) {
		
		Player a=(Player) o1;
		Player b=(Player) o2;
		if(a.score>=b.score){
			if(a.score==b.score){
				return a.name.compareTo(b.name);
			}
			return a.score;
		}
		else{
			return b.score;
		}
	}

}
