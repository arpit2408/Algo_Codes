/**
 * 
 */
package Solutions;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author arpit2408
 *
 */
public class DecodeString {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "3[a]2[bc]";
		String s1= "3[a2[c]]";
		String s3= "2[abc]3[cd]ef";
		String s4="100[leetcode]";
		System.out.println(decodeString(s1));

	}
	
	    public static String decodeString(String s) {
	    	StringBuilder returnstr = new StringBuilder();
	    	int counter=1;
	        StringBuilder tempstr= new StringBuilder();
	        StringBuilder numbers=new StringBuilder();
	        ArrayList<Integer> numbercount=new ArrayList<>();
	        ArrayList<String> substrnglist=new ArrayList<>();
	        for(int i=0;i<=s.length()-1;i++)
	        {
		            char c=s.charAt(i);
		            if(c=='[')
		            {
		            	if(numbers.length()>0)
		            	{
		            		numbercount.add(Integer.parseInt(numbers.toString()));
		            		numbers.setLength(0);
		            	}
		            }
		            else if(c==']')
		            {
		            	counter=numbercount.get(numbercount.size()-1);
		            	if(numbercount.size()==1)
		            	{
		            		for(int q=0;q<counter;q++)
		            			returnstr.append(tempstr);
		            	}
		            	else
		            	{
		            		//for(int q=0;q<counter;q++)
		            			//tempstr.append(str);
		            	}
		            	/*if(tempstr.length()>0)
		            		substrnglist.add(tempstr.toString());
		            	counter=numbercount.get(numbercount.size()-1);
		            	if(substrnglist.size()>0)
		            	{
		            		String substr=substrnglist.get(substrnglist.size()-1);
		            		for(int q=0;q<counter;q++)
		            		{
		            			returnstr.append(substr);
		            		}
		            		substrnglist.remove(substrnglist.size()-1);
		            		tempstr.setLength(0);
		            	}
		            	else
		            	{
		            		for(int q=0;q<counter;q++)
		            		{
		            			returnstr.append(tempstr);
		            		}
		            		tempstr.setLength(0);
		            	}
		            	numbercount.remove(numbercount.size()-1);
		            	if(numbers.size()>1)
		            	{
		            		String[] strarr=bufferstr.toString().split(" ");
			            	//decodeStrings(tempstr.toString(),numbers.get(numbers.size()-1));
		            		for(int q=0;q<numbers.get(numbers.size()-1)-1;q++)
		            		{
		            			tempstr.append(tempstr);
		            		}
			            	numbers.remove(numbers.size()-1);
		            		String tempg=tempstr.toString();
		            		tempstr.setLength(0);
		            		tempstr.append(strarr[strarr.length-1].trim());
		            		tempstr.append(tempg);
		            	}
		            	else
		            	{
		            		decodeStrings(tempstr.toString(),numbers.get(numbers.size()-1),returnstr);
		            		numbers.remove(numbers.size()-1);
		            		tempstr.setLength(0);
		            	}*/
		            }
		            else if(!(c>='0' && c<='9'))
	                {
	                    tempstr.append(c);
	                }
		            else
		            {
		            	numbers.append(Character.getNumericValue(c));
		            	if(tempstr.length()>0)
		            	{
			            	substrnglist.add(tempstr.toString());
			            	tempstr.setLength(0);
		            	}
		            		
		            }
		         
	        }
	        if(tempstr.length()>0)
	        	returnstr.append(tempstr);
	        return returnstr.toString();
	    }
	    /*public static String decodeStrings(String str,int repeat,StringBuilder returnstr)
	    {
	    	for(int i=0;i<repeat;i++)
	    	{
	    		returnstr.append(str);
	    	}
	    	return returnstr.toString();
	    }*/
	}

