package S9;

import java.util.Scanner;

public class CustomLogic 
{
	public static void main(String[] args)
	{
		 Scanner sc= new Scanner(System.in);
			
			System.out.print("Enter the String :");
			String str=sc.nextLine();
			
			String result="";
			
			for(int i=0; i<str.length(); i++)
			{
				char ch=str.charAt(i);
				
				if(ch != ' ') 
				{
					result+=ch;
				}
			}
			System.out.println("After removing spaces: " + result);
		
	}

}
