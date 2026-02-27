package S18;

public class Strings
{
	public static void main(String[] args) 
	{

        String s = "Java@123#Code!";

        int alphabets = 0;
        int digits = 0;
        int special = 0;

        for(int i=0 ; i<s.length(); i++)
        {
        	char ch=s.charAt(i);
        	if(ch >= 'a' && ch <='z' || ch >= 'A' && ch <='Z')
        	{
        		alphabets++;
        	}
        	else if(ch>='0' && ch<='9')
        	{
        		digits++;
        	}
        	else
        	{
        		special++;
        	}
        }

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
		
	}

}
