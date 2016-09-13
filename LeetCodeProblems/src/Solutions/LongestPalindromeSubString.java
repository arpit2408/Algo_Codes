/**
 * 
 */
package Solutions;

/**
 * @author arpit2408
 *
 */
public class LongestPalindromeSubString {

	/**
	 * @param args
	 * saselnglolarora
		i=1 len1=1 len2=0 len=1 start = 1 end = 1
		i=2 len1=1 len2=0 len=1 start = 2 end = 2
		i=3 len1=1 len2=0 len=1 start = 3 end = 3
		i=4 len1=1 len2=0 len=
	 */
	public static void main(String[] args) {
		String s="saselnglolarora";
		System.out.println(new LongestPalindromeSubString().longestPalindrome(s));
	}
	public String longestPalindrome(String s) {
	    int start = 0, end = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int len1 = expandAroundCenter(s, i, i);
	        int len2 = expandAroundCenter(s, i, i + 1);
	        int len = Math.max(len1, len2);
	        if (len > end - start) {
	            start = i - (len - 1) / 2;
	            end = i + len / 2;
	        }
	    }
	    return s.substring(start, end + 1);
	}

	private int expandAroundCenter(String s, int left, int right) {
	    int L = left, R = right;
	    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	        L--;
	        R++;
	    }
	    return R - L - 1;
	}


}
