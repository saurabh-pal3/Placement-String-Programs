package S1;

public class Strings 
{
    public static void main(String[] args) 
    {
    	 String str= "Saurabh";
    	 String rew=" ";
    	 
    	 for(int i=str.length()-1; i>=0;i--)
    	 {
    		 rew=rew+str.charAt(i);
    	 }
    		 System.out.println("Reverse of String is : "+rew);
    		 
	
}
}
