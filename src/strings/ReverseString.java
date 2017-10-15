package strings;

public class ReverseString {
	    /* Function to print reverse of the passed string */
	    void reverse(String str,int i,int len)
	    {
	        if (i>len-1)
	           return;	           
	        else
	        {
	            reverse(str,i+1,len);
	            System.out.print(str.charAt(i));
	        }
	    }
	     
	    /* Driver program to test above function */
	    public static void main(String[] args) 
	    {
	        String str = "Geeks for Geeks";
	        ReverseString obj = new ReverseString();
	        int len=str.length();
	        obj.reverse(str,0,len);
	    }    
}
