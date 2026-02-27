package S3;

public class Strings
{
	public static void main(String[] args)
	{
		String s= "Saurabh Pal";
		int vowel=0;
		int consonants =0;
		s=s.toLowerCase();
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				if(ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i')
				{
					vowel++;
				}
				else
				{
					consonants++;
				}
			}
		}
		
		 System.out.println("Vowels = " + vowel);
	        System.out.println("Consonants = " + consonants);
		
		
	}

}
