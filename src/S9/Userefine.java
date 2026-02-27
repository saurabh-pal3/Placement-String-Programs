package S9;

import java.util.Scanner;

public class Userefine
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String str=sc.nextLine();
		
		String result=str.replaceAll("\\s+", "");
		
		 System.out.println("After removing spaces: " + result);
		
		
	}

}
