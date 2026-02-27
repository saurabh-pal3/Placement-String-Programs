package S5;

import java.util.Scanner;

public class Strings 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Words :");
		String s=sc.nextLine();
		
		
		String upperCase = s.toUpperCase();
		String lowerCase = s.toLowerCase();
		
		   System.out.println("Uppercase: " + upperCase);
	        System.out.println("Lowercase: " + lowerCase);
	}

}
