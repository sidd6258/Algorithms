package leetCode;

import java.util.HashMap;
import java.util.Map;

//Range 1-3999
// 1 -> I
// 5 -> V
// 10 -> X
// 50 -> L
// 100 -> C
// 500 -> D
// 1000 -> M

public class IntegerToRoman {

	public String intToRoman(int num) {

		String[] dict = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] vals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<vals.length;i++) {
        		if(num>=vals[i]) {
        			int count = num/vals[i];
        			num = num%vals[i];
        			for(int j=0;j<count;j++) {
        				sb.append(dict[i]);
        			}
        		}
        }
        return sb.toString();
	}

	public int romanToInt(String s) {
        char[] ca = s.toCharArray();
        int result = 0;
        for (int i = 0; i < ca.length; i++) {
            int val = getRomanVal(ca[i]);
            if (i == ca.length-1 || val >= getRomanVal(ca[i+1])) result += val;
            else result -= val;
        }
        return result;
    }
    private int getRomanVal(char c) {
        if (c =='M') return 1000;
        if (c =='D') return 500;
        if (c =='C') return 100;
        if (c =='L') return 50;
        if (c =='X') return 10;
        if (c =='V') return 5;
        return 1;
    }
	public static void main(String[] args) {
		IntegerToRoman roman = new IntegerToRoman();
		System.out.println(roman.intToRoman(1983));
		System.out.println(roman.romanToInt("MCMLXXXIII"));
	}



}
