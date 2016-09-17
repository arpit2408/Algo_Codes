/**
 * 
 */
package Demark;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author arpit2408
 *
 */
public class AlmostKprime {

	/**Two types of functions are there in this class
	 * kprime(int n,int k) takes two arguments n,k
	 * It prints first n numbers which are exactly divisible by k numbers in between the 1 and number
	 * Integer.MAX_VALUE=2147483647
	 * almostKPrime(int n,int k) takes two arguments n,k
	 * It prints first n numbers which have exactly k numbers as its prime factors 
	 * Task is to print first n almost k-prime numbers
	 * Input : k = 2, n = 5
	 * Output : 4 6 9 10 14
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int u=Integer.MAX_VALUE;
		System.out.println("Enter the number of natural number you want printed:-");
		int n=scanner.nextInt();
		System.out.println("Enter the value to which u wanna check almost prime property i.e.:-");
		int k=scanner.nextInt();
		//ArrayList<Integer> finalList=kdivisiblenumbers(n,k);
		ArrayList<Integer> almostprime=almostKPrime(n, k);
		System.out.println("List of k-divisiblenumbers:-");
		/*for(int i=0;i<n;i++)
		{
			System.out.print(finalList.get(i)+"\t");
		}*/
		System.out.println();
		System.out.println("List of Almost prime:-");
		for(int i=0;i<n;i++)
		{
			System.out.print(almostprime.get(i)+"\t");
		}
	}
	public static ArrayList<Integer> kdivisiblenumbers(int n,int k)
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
	public static ArrayList<Integer> almostKPrime(int n,int k)
	{
		ArrayList<Integer> arralmostprime=new ArrayList<>();
		boolean flag=true;
		int naturaln0=1;
		ArrayList<Integer> factors=new ArrayList<Integer>();
		if(n>999999)
		{
			flag=false;
		}
		while (flag)
		{
		naturaln0++;
		factors.clear();
		int numbercheck=naturaln0;
		for (int i = 2; i <= numbercheck/i; i++) {
		      while (numbercheck % i == 0) {
		        factors.add(i);
		        numbercheck /= i;
		      }
		    }
		if (numbercheck > 1) {
		      factors.add(n);
		    }
		if(factors.size()==k)
			arralmostprime.add(naturaln0);
		if(arralmostprime.size()==n)
			flag=false;
		}
		
		return arralmostprime;
	}
}
