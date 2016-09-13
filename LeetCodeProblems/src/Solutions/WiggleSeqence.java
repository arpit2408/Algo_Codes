package Solutions;
import java.util.Scanner;
import java.util.Vector;

class WiggleSequence
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		//Vector<Integer> samplearray = new Vector<>();
		int[] sam=new int[]{1,17,5,10,13,15,10,5,16,8};
		/*boolean flag=true;
		while(flag)
		{
			System.out.println("Enter elements of Array(Enter -1 to stop):");
	    	Scanner in = new Scanner(System.in);
	    	String number=in.next();
	    	try
	    	{
	    		int num = Integer.parseInt(number);
				if(num==-1)
				{
					flag=false;
					break;
				}
				samplearray.addElement(num);
				if(num==-1)
					flag=false;
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("Please enter only numbers");
	    	}
		}*/
		System.out.println();
		System.out.println("Biggest Sequence is:-"+wiggleMaxLength(sam));
		
	}
	public static int wiggleMaxLength(int[] samplearray) 
	{
		Vector<Integer> wigglearray=new Vector<Integer>();
		Vector<Integer> wigglearrays=new Vector<Integer>();
		Vector<Integer> storeLlongestarray=new Vector<Integer>();
		int biggest=0; 
		int first;
		int second;
		if(samplearray.length==0)
			return(0);
		if(samplearray.length==1)
			return(1);
		if(samplearray.length==2)
		{
			if((samplearray[0]>0 && samplearray[1]<0) || (samplearray[0]<0 && samplearray[1]>0))
				return(2);
			else
				return(1);
		}
		int flag=0;
		for (int num=0;num<samplearray.length-2;num++) 
		{
			first=samplearray[num+1]-samplearray[num];
			second=samplearray[num+2]-samplearray[num+1];
			if((first<0 && second>0) || (first>0 && second<0) )
			{
				if(wigglearray.size()==0)
				{
					wigglearray.add(first);
					wigglearray.add(second);
					wigglearrays.add(samplearray[num]);
					wigglearrays.add(samplearray[num+1]);
					wigglearrays.add(samplearray[num+2]);
					if(first>biggest)
						biggest=first;
					else if(second>biggest)
						biggest=second;
				}
				else if((wigglearray.lastElement()<0 && second>0 ) || (wigglearray.lastElement()>0 && second<0 ))
				{
						wigglearray.add(second);
							if(second>biggest)
								biggest=second;
							wigglearrays.add(samplearray[num+2])	;
				}
			}
			else
			{
				if(wigglearrays.size()>storeLlongestarray.size())
					{
						storeLlongestarray.addAll(wigglearrays);
					}
				wigglearrays.clear();
			}
		}
		if(wigglearrays.size()>storeLlongestarray.size())
		{
			storeLlongestarray.addAll(wigglearrays);
		}
		if(storeLlongestarray.size()==0 && samplearray.length>2 && samplearray[0]!=samplearray[1] )
			return(2);
		if(storeLlongestarray.size()==0)
			return(1);
		if(wigglearray.size()==samplearray.length-1)
		{
			return(biggest);
		}
		else
		{
			return (storeLlongestarray.size());
		}
	}
	
}