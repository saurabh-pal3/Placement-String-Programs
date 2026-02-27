package S17;

public class Strings 
{
	public static void main(String[] args) 
	{

        String s = "Java is powerful and simple";
        
        String [] words=s.split(" ");
        
        String smallest=words[0];
        String largest=words[0];
        
        for(int i=0; i<words.length; i++)
        {
        	if(words[i].length()< smallest.length())
        	{
        	   smallest=words[i];
        	}
        	
        	if(words[i].length() > largest.length())
        	{
        		largest=words[i];
        	}
        }
        
        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);
    
		
	}

}
