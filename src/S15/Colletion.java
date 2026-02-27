package S15;

import java.util.LinkedHashSet;

public class Colletion
{
	public static void main(String[] args)
	{
		String s = "programming";
		
		String r="";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(char ch : s.toCharArray())
		{
			set.add(ch);
		}
		
		for(char c : set)
		{
			r+=c;
		}
		
		System.out.println(r);
		
	}

}
