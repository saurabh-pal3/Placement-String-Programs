package S15;

import java.util.Scanner;

public class Strings
{
	public static void main(String[] args)
	{
		String result="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s= sc.nextLine();
		
		for(int i=0; i<s.length(); i++)
		{
			char ch =s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				result+=Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch))
			{
				result+=Character.toUpperCase(ch);
			}
			else
			{
				result+=ch;
			}
		}
		
		System.out.println("After Swaping String is : "+result);
		
		
	}

}
