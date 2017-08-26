package hackerrank;

import java.io.*;
import java.util.*;


class MyCalculator{
	int power(int n,int p) throws Exception{
			if(n <0 || p<0){
				throw new Exception();
			}
		return (int) Math.pow(n, p);
	}
}

class Solution {

	 public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);

	  while ( in .hasNextInt()) {
	   int n = in .nextInt();
	   int p = in .nextInt();
	   MyCalculator my_calculator = new MyCalculator();
	   try {
	    System.out.println(my_calculator.power(n, p));
	   } catch (Exception e) {
	    System.out.println(e);
	   }
	  }
	 }
	}