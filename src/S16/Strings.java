package S16;

public class Strings 
{
    public static void main(String[] args)
    {
        String s = "Hello Saurabh Pal";
        
        String[] words = s.split(" ");
        String result = "";
        
        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverse = "";
            
            for(int j = word.length() - 1; j >= 0; j--)
            {
                reverse += word.charAt(j);
            }
            
            result += reverse + " ";
        }
        
        System.out.println(result.trim());
    }
}