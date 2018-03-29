package leetCode;

public class pow {
	static double pow(double m, int n) {
		double finalRes=1; 
	  if(n == 0) return 1;
	  finalRes = pow(m,n/2);
	  if(n%2 == 0)
	  	return finalRes*finalRes;
	   else{
	   	if(n>0) return m*finalRes*finalRes;
	    else return (finalRes*finalRes)/m;
	   }
	}
	public static void main(String[] args){
		System.out.println(pow(2.0,-3));
	}
}
