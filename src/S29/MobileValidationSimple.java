package S29;



public class MobileValidationSimple
{

    public static void main(String[] args) {

        String mobile = "9876543210";

        String regex = "^(\\+91|91)?[6-9][0-9]{9}$";

        if (mobile.matches(regex))
        {
            System.out.println("Valid Mobile Number");
        } 
        else 
        {
            System.out.println("Invalid Mobile Number");
        }
    }
}