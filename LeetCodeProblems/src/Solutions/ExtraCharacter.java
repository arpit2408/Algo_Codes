package Solutions;

import java.util.Arrays;

public class ExtraCharacter {

	public static void main(String[] args) {
		
		findTheDifference("bacd","abcde");
		   
		}
	 public static char findTheDifference(String s, String t) {
	        char[] firststring=s.toCharArray();
	        char[] secondstring=t.toCharArray();
	        Arrays.sort(firststring);
	        Arrays.sort(secondstring);
	        for(int i=0;i<firststring.length;i++)
	        {
	            if(firststring[i]!=secondstring[i])
	            return secondstring[i];
	        }
	        return 0 ;
	    }
}
