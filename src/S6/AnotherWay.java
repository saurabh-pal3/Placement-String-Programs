package S6;

public class AnotherWay 
{
	public static void main(String[] args)
	{
		String s= "Saurabh";

		int c=0;
		for(char ch : s.toCharArray())
		{
			c++;
		}
		
		System.out.println("The Length is : "+c);
	}
}
