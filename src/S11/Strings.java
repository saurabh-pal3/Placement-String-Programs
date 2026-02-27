package S11;

import java.util.Scanner;

public class Strings 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        char result = '\0';   // default empty character
	        boolean found = false;
		
	        for(int i=0; i<str.length(); i++)
	        {
	        	int c=0;
	        	for(int j=0 ; j<str.length(); j++)
	        	{
	        		if(str.charAt(i)==str.charAt(j))
	        		{
	        			c++;
	        		}
	        	}
	        	
	        	if(c==1)
	        	{
	        		found=true;
	        		result=str.charAt(i);
	        		break;
	        				
	        	}
	        	 
	        }
	        if (found)
       	 {
                System.out.println("First non-repeated character: " + result);
            } 
       	 else
            {
                System.out.println("No non-repeated character found.");
            }
	}

}
