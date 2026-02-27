package S4;

public class Strings 
{
	public static void main(String[] args)
	{
		String s = "  Hello   world  from   Java  ";
		
		String word[] =s.trim().split("\\s+");
		
		int count=s.trim().isEmpty() ? 0 :word.length;
		
		System.out.println("Word count = " +count);
	}

}
