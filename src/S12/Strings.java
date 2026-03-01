package S12;

import java.util.HashMap;

public class Strings
{
	public static void main(String[] args)
	{
		String s="Saurabh";
		
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++)
		{
			char ch= s.charAt(i);
			
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			
			
		}
		System.err.println(map);
		
	}

}
