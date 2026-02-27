package S20;

import java.util.Scanner;

public class LargestOddSubstring {

    public static String largestOddNumber(String s) {

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--)
        {

            char ch = s.charAt(i);

            // Check if digit is odd
            if ((ch - '0') % 2 == 1) 
            {

                String result = s.substring(0, i + 1);

                // Remove leading zeros
                int start = 0;
                while (start < result.length() - 1 && result.charAt(start) == '0')
                {
                    start++;
                }

                return result.substring(start);
            }
        }

        return ""; // No odd digit found
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a large integer string: ");
        String s = sc.nextLine();

        String answer = largestOddNumber(s);

        if (answer.isEmpty()) 
        {
            System.out.println("No odd substring found.");
        } else {
            System.out.println("Largest odd substring: " + answer);
        }

        sc.close();
    }


            
		
	
	

}
