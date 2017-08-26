package strings;

public class UniqueCharacter {

	public static boolean isUnique(String s)
	{
		char[] c=s.toCharArray();
		
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(s.substring(i+1).contains(s.substring(i,i+1)))
				{
				return false;
				}
		}		
		return true;
	}
	
	public static void main(String[] args) {
		String s="abcdeAfghi";
		if(isUnique(s))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");			
		}
	}

}
