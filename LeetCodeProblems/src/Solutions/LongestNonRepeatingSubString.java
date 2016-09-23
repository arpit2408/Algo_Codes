/**
 * 
 */
package Solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author arpit2408
 *
 */
public class LongestNonRepeatingSubString {

	/**
	 * @param args
	 */
	int width=0;
	public static void main(String[] args) {
		String s="bdcglrghklsdmdwoklskkkkgsesff fselkfese ";
		String s1="aab";
	     String string1 = "HELLO";
	     System.out.println(string1.toLowerCase());
	     System.out.println(string1); 
		System.out.println(lengthOfLongestSubstring(s));
		int y=Integer.MAX_VALUE;
	}
	
	 public static int lengthOfLongestSubstring(String s) {
	        int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
	public static int lengthOfLongestSubstrings(String s) {
        StringBuilder str=new StringBuilder();
        StringBuilder oldrstr=new StringBuilder();
        HashMap<Character,Integer> alreadyvisited=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!alreadyvisited.containsKey(c))
            {
                str.append(c);
                alreadyvisited.put(c,i);
            }
            else
            {
                i=alreadyvisited.get(c)+1;
                if(oldrstr.length()<str.length())
                {
                    oldrstr.setLength(0);
                    oldrstr.append(str);
                    str.setLength(0);
                }
                else
                {
                    str.setLength(0);
                }
                alreadyvisited.clear();
                str.append(c);
                alreadyvisited.put(s.charAt(i),i);
            }
        }
        if(oldrstr.length()<str.length())
        {
        	oldrstr.setLength(0);
            oldrstr.append(str);
        }
        return oldrstr.length();
    }
}
