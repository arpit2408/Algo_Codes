/**
 * 
 */
package Solutions;
import java.util.Vector;
/**
 * @author arpit2408
 * 
A sequence of numbers is called a wiggle sequence if the differences between successive numbers strictly alternate between positive and negative. The first difference (if one exists) may be either positive or negative. A sequence with fewer than two elements is trivially a wiggle sequence.

For example, [1,7,4,9,2,5] is a wiggle sequence because the differences (6,-3,5,-7,3) are alternately positive and negative. In contrast, [1,4,7,2,5] and [1,7,4,5,5] are not wiggle sequences, the first because its first two differences are positive and the second because its last difference is zero.

Given a sequence of integers, return the length of the longest subsequence that is a wiggle sequence. A subsequence is obtained by deleting some number of elements (eventually, also zero) from the original sequence, leaving the remaining elements in their original order.

Examples:

Input: [1,7,4,9,2,5]
Output: 6
The entire sequence is a wiggle sequence.

Input: [1,17,5,10,13,15,10,5,16,8]
Output: 7
There are several subsequences that achieve this length. One is [1,17,10,13,10,16,8].

Input: [1,2,3,4,5,6,7,8,9]
Output: 2

Follow up:
Can you do it in O(n) time? 
 *
 */
public class SolutionWiggle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] sam=new int[]{0,-1};
		System.out.println();
		System.out.println("Biggest Sequence is:-"+(new SolutionWiggle()).wiggleMaxLength(sam));
	}
	    public int wiggleMaxLength(int[] samplearray) 
		{
			Vector<Integer> wigglearray=new Vector<Integer>();
			Vector<Integer> wigglearrays=new Vector<Integer>();
			int first;
			if(samplearray.length==0)
				return(0);
			if(samplearray.length==1)
				return(1);
			if(samplearray.length==2)
			{
				if((samplearray[0]>=0 && samplearray[1]<0) || (samplearray[0]<0 && samplearray[1]>=0))
					return(2);
				else
					return(1);
			}
			for (int num=0;num<samplearray.length-1;num++) 
			{
				first=samplearray[num+1]-samplearray[num];
				if(wigglearray.size()==0)
				{
	    			wigglearray.add(first);
	    			wigglearrays.add(samplearray[num]);
	    			wigglearrays.add(samplearray[num+1]);
				}
				else  if((wigglearray.lastElement()>0 && first<0) || (wigglearray.lastElement()<0 && first>0))
				{
				   wigglearray.add(first);
				   //wigglearrays.add(samplearray[num]);
	    		   wigglearrays.add(samplearray[num+1]);
				}
			}
			if(wigglearrays.size()==2)
			{
				if(wigglearrays.elementAt(0)==wigglearrays.elementAt(1))
					return(1);
			}
				return (wigglearrays.size());
		}

}
