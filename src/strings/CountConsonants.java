package strings;

import java.util.Scanner;

public class CountConsonants {
	

	public static boolean isConsanant(String c){
	    String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
	    return cons.contains(c);
	}

	public static void main(String[] args) {

		int consanantCount = 0;
		String s="siddharth";
		char[] charArray= s.toCharArray();
		for(Character c : charArray)
		{
		if (isConsanant(c.toString()))
			consanantCount++;
		else
		    continue;
		}
		System.out.println("Number of consonants are: "+consanantCount);

	}

}
