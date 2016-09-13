/**
 * 
 */
package Demark;

import java.util.ArrayList;

/**
 * @author arpit2408
 *
 */
public class AlmostKprime {

	/**
	 * Task is to print first n almost k-prime numbers
	 * Input : k = 2, n = 5
	 * Output : 4 6 9 10 14
	 * @param args
	 */
	public static void main(String[] args) {
		int n=9,k=2;
		ArrayList<Integer> finalList=kprime(n,k);
		for(int i=0;i<n;i++)
		{
			System.out.println(finalList.get(i));
		}
	}
	public static ArrayList<Integer> kprime(int n,int k)
	{
		ArrayList<Integer> arralmostprime=new ArrayList<>();
		boolean flag=true;
		int naturaln0=1;
		int counter=0;
		while (flag)
		{
			if(k==1)
			{
				counter=0;
				for(int i=2;i<Math.pow(naturaln0, 0.5);i++)
				{
					if(naturaln0%i==0)
					{
						counter++;
					}
				}
				if(counter==0)
				{
					arralmostprime.add(naturaln0);
				}
			}
			else
			{
				counter=0;
				for(int i=2;i<=naturaln0;i++)
				{
					if(naturaln0%i==0)
					{
						counter++;
					}
				}
				if(counter==k)
				{
					arralmostprime.add(naturaln0);
				}
			}
			naturaln0++;
			if(arralmostprime.size()==n)
				flag=false;
		}
		return arralmostprime;
	}
	
}
