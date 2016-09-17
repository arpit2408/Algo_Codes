package Demark;
public class Demark {

	public static void main(String args[])
	{
		int[] a={1,2,0,4,0};
		 ;
		System.out.println(getClosestToZero(a));

	}
    public static int getClosestToZero(int[] a) {
        for(int i=0;i<a.length-1;i++)
        {
        	if(a[i]==0)
        	{
        		if(i==0)
        			return a[0];
        		if(a[i-1]>a[i+1])
        			return a[i-1];
        		else
        			return a[i+1];
        	}
        }
        return a[a.length-2];
    }
}