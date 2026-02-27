package S10;

import java.util.Scanner;

public class Strings
{
	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first string: ");
	        String str1 = sc.nextLine();

	        System.out.print("Enter second string: ");
	        String str2 = sc.nextLine();

	        boolean isEqual = true;
	        // length comaparison
	        if(str1.length()!=str2.length())
	        {
	        	 isEqual=false;
	        	 
	        }// charactger comaparion
	        else
	        {
	        	for(int i=0; i<str1.length(); i++)
	        	{
	        		if(str1.charAt(i)!= str2.charAt(i))
	        		{
	        			isEqual=false;
	        			break;
	        		}
	        	}
	        }

	        if (isEqual) {
	            System.out.println("Both strings are equal.");
	        } else {
	            System.out.println("Strings are NOT equal.");
	        }
		
	}

}
