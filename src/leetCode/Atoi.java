package leetCode;

import java.util.ArrayList;

public class Atoi {
	public int myAtoi(String str) {
		int index = 0, sign = 1, total = 0;
		if (str.length() == 0)
			return 0;
		while (str.charAt(index) == ' ') {
			index++;
		}
		if (index < str.length()) {
			sign = (str.charAt(index) == '+' ? 1 : -1);
			index++;
		}
		
		while(index<str.length()) {
			int digit=str.charAt(index)-'0';
			if(digit<0 || digit>9) break;
			if(Integer.MAX_VALUE/10<total || Integer.MAX_VALUE/10==total && Integer.MAX_VALUE%10<digit) {
				return sign==1? Integer.MAX_VALUE:Integer.MIN_VALUE;
			}
			total=total*10 +digit;
			index++;
		}
		return total*sign;

	}

	public static void main(String[] args) {
		Atoi atoi = new Atoi();
		System.out.println(atoi.myAtoi("+123 12"));

	}

}
