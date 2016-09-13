/**
 * 
 */
package Demark;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author arpit2408
 *
 */


public class BetterProgrammerTask {
public static void main(String args[])
{
	int i=Integer.MAX_VALUE;
	String s="12 some text 3  7 "+i;
			//System.out.println(getSumOfNumbers(s));
			//System.out.println(countAlmostPrimeNumbers(1,3));
			System.out.println(getProbability(5,1));
}

public static double getProbability(int Y, int X) {
    /*
      If you roll Y standard six-sided dice, what’s the probability that you get at least X 4s?
      To calculate that you should divide the number of comibnations with X or more 4s
      by the total number of possible combinations.
     */
	if (Y < X*4) 
        return 0; 
    double prob4s = 1; 
    //calc 4s combination chance 
    prob4s = prob4s/6/6/6/6; 
    //every roll more then 4 give us plus prob4s / 4 chance 
    return prob4s + (Y % X) * prob4s / 4; 
}
public static int countAlmostPrimeNumbers(int from, int to) {
	if(to==Integer.MAX_VALUE || from==Integer.MAX_VALUE)
	{
		return 0;
	}
	if((from<0 || to<0) || (to-from<0))
	{
		return 0;
	}
	
	ArrayList<Integer> arrprimelist=new ArrayList<Integer>();
	ArrayList<Integer> listofalmostprime=new ArrayList<Integer>();
	if(from>2)
	{
		listofalmostprime.add(2);
	}
	if(from>10)
	{
		arrprimelist.add(2);
		arrprimelist.add(3);
		arrprimelist.add(5);
		arrprimelist.add(7);
	}
	for(int i = from;i<=to;i++)
	{
		if(i%2!=0 || i%3!=0 || i%5!=0 || i%7!=0 )
		{
			arrprimelist.add(i);
		}
	}
	boolean flag=true;
	for(int i =from;i<=to;i++)
	{
		flag=false;
		for(int j=0;j<arrprimelist.size();j++)
		{
			if(i%arrprimelist.get(j)==0)
				{
				flag=true;
					for(int k=2;k<i;k++)
					{
						if(i%k==0)
						{
							flag=false;
						}
					}
				  
				}
		}
		if(flag)
		{
			listofalmostprime.add(i);
		}
		
	}
	return listofalmostprime.size();
    /*
      A prime number is a natural number that has exactly two distinct natural number divisors,
      which are 1 and the prime number itself.
      The first prime numbers are: 2, 3, 5, 7, 11, 13.

      Almost prime numbers are the non-prime numbers
      which are divisible by only a single prime number.

      Please implement this method to
      return the number of almost prime numbers within the given range (inclusively).
     */
}
public static interface Node {
    int getValue();
    List<Node> getChildren();
}
public static List<Node> traverseTreeInDepth(Node root) {
	Deque<Node> stackar = new LinkedList<Node>();
    List<Node> retvaar = new ArrayList<Node>(stackar.size());

    stackar.push(root);
    while (stackar.size() > 0) {
        Node node = stackar.pop();
        retvaar.add(node);

        for (Node n : node.getChildren()) {
            stackar.push(n);
        }
    }

    return retvaar;
    /*
      Please implement this method to
      traverse the tree in depth and return a list of all passed nodes.

      The method shall work optimally with large trees.
     */
}
    public static int getSumOfNumbers(String s) {
    	int max=0;
    	String[] stringsplit=s.split(" ");
    	int maxsum=0;
    	for(int i=0;i<stringsplit.length;i++)
    	{
    		try
    		{
    		int number=Integer.parseInt(stringsplit[i]);
    		if(number == Integer.MAX_VALUE)
    			return Integer.MAX_VALUE;
    		max+=number;
    		}
    		catch (NumberFormatException e)
    		{
    			continue;
    		}
    	}
    	return max;
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
    }
}

	