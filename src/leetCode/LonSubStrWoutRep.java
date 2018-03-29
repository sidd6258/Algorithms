package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LonSubStrWoutRep {
	public int lengthOfLongestSubstring(String s) {
		int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); 
        for (int j = 0, l = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                l = Math.max(map.get(s.charAt(j)), l);
            }
            ans = Math.max(ans, j - l + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
	    }

	public static void main(String args[]) {

	}
}
