/**
 * 
 */
package Solutions;

import java.util.ArrayList;

/**
 * @author ****
 *
 */
public class ReversePalindSubStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
			String s="sabollolpiplastcruelpopblacksheeparoundioihingerigoroussas";
			int startindex=0;
			int endIndex=2;
			StringBuilder temp=new StringBuilder();
			StringBuilder revtemp=new StringBuilder();
			ArrayList<String> palindSubString=new ArrayList<String>();
			for(int i=0;i<s.length();i++)
			{
				for(int j=i;j<s.length()-1;j++)
				{
					String original=temp.append(s.substring(startindex+i, endIndex+j)).toString();
					if(compare(original,temp.reverse()))
					{
						palindSubString.add(temp.toString());
					}
					temp.setLength(0);
				}
				temp.setLength(0);
			}
			for(String str:palindSubString)
			{
				System.out.println(str);
			}
	}
	public static boolean compare(String str1,StringBuilder str2)
	{
		for(int i=0;i<str1.length();i++)
		{
			if(!(str1.charAt(i)==str2.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}

}
