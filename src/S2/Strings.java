package S2;

public class Strings
{
	public static void main(String[] args)
	{
		String s= "Madam";
		String rew="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rew=rew+s.charAt(i);
			
		}
		
		if(rew.equalsIgnoreCase(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
			
			
	}

}
