package S7;

import java.util.Scanner;

public class OneChar
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the String :");
		String str=sc.nextLine();
		
		System.out.print("Enter the Characters to count :");
		char ch=sc.next().charAt(0);
		
		int c=0;
		
		for(int i=0 ; i<str.length(); i++)
		{
			if(str.charAt(i)==ch)
			{
				c++;
			}
		}
		System.out.println("Frequency of '" + ch + "' = " + c);
		sc.close();
	}
	

}
