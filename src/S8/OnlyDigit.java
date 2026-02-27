package S8;

import java.util.Scanner;

public class OnlyDigit
{
	public static void main(String[] args)
	{
       Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the String :");
		String str=sc.nextLine();
		
		boolean isDigit=true;
		
		if(str.length()==0)
		{
			isDigit=false;
		}
		else
		{
			for(int i=0; i<str.length();i++)
			{
				char ch =str.charAt(i);
				
				if(ch < '0' || ch > '9')
				{
					isDigit=false;
				}
			}
		}
		
	
		 if (isDigit)
		 {
	            System.out.println("String contains only digits.");
	        }
		    else 
	        {
	            System.out.println("String does NOT contain only digits.");
	        }
		
	}

}
