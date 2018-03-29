package leetCode;

public class IsNumberPalindrome {
	public boolean isPalindrome(int x) {
		int digits=0;
		int temp=x;
		while(temp!=0) {
			temp=temp/10;
			digits++;
		}
		int j=digits-1;
		temp=x;
		while(j>=digits/2) {
			int endNum=x; 
			int end= (int) (endNum/Math.pow(10, j));
			int first=(int) (temp%10);
			if(first!=end%10) return false;
			temp=temp/10;
			j--;
		}
		return true;

	}
	public static void main(String[] args) {
		IsNumberPalindrome palin=new IsNumberPalindrome();
		System.out.println(palin.isPalindrome(10));
	}
}
