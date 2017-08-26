package bitmanipulation;

public class BinaryToString {
public static void main(String[] args){
	double n=0.125;
	System.out.println(printBinary(n));
}

public static String printBinary(double n){
	if (n >= 1 || n <= 0) {
		return "ERROR";
	}
	StringBuilder binary=new StringBuilder();
	binary.append(".");
	while(n>0){
		if (binary.length() > 32) {
			return "ERROR";
		}
		double r=n*2;
		if(r>=1){
			binary.append("1");
			n=r-1;
		}
		else{
			binary.append("0");
			n=r;
		}
		
	}
	return binary.toString();
}
}
