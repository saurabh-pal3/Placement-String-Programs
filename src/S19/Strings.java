package S19;

import java.util.HashSet;
import java.util.Set;

public class Strings 
{
	public static void main(String[] args)
	{

        String s = "The quick brown fox jumps over the lazy dog";
        s = s.toLowerCase();
        
        Set<Character> set= new HashSet<Character>();
        
        for(char ch : s.toCharArray())
        {
        	if(Character.isLetter(ch))
        	{
        		set.add(ch);
        	}
        }
        
        if (set.size() == 26)
        {
        	System.out.println("Pangram");
        }   
        else
        {
        	 System.out.println("Not Pangram");
        }
           
		
	}

}
