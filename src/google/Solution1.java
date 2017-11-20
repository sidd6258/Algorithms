package google;

public class Solution1 {
	public static void main(String []args){
		String s="2-4A0r7-4k";
		
		String s1=s.replaceAll("[\\s\\-()]", "");
		System.out.println(s1);
		s1=s1.toUpperCase();
		System.out.println(s1);
		
		char []a=s1.toCharArray();
		StringBuilder sb=new StringBuilder();
		int k=4;
		for(int i=0;i<a.length;i++){
			if((i+1)%k==0){
				sb.append(a[i]);
				if(i<a.length-1){
				sb.append("-");}
			}
			else{
				sb.append(a[i]);
			}
		}
		System.out.println(sb);
		
		}
}
