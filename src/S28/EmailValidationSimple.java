package S28;

public class EmailValidationSimple 
{
	public static void main(String[] args) 
	{

        String email = "saurabh123@gmail.com";

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        
        if(email.matches(regex))
        {
        	System.out.println("Valid Email");
        }
        else
        {
        	System.out.println("Invalid Email");
        }
		
	}

}
