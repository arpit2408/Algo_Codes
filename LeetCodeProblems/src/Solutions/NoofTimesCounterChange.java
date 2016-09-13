/**
 * 
 */
package Solutions;

/**
 * @author arpit2408
 *
 */
public class NoofTimesCounterChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(integerReplacement(2147483647));

	}
	public static int integerReplacement(int n) {
		int counter=0;
        int temp=0;
        long var=0;
        if(n==Integer.MAX_VALUE)
        	{
        		var=n;
        		while(var!=1)
                {
                    if(var%2==0)
                     var=var/2;
                     else
                     {
                         if(var==3)
                         {
                             var=var-1;
                         }
                         else
                         {
                    		 temp=n-1;
                    		 temp=temp/2;
                    		 if(temp%2!=0)
                    		 var=var+1;
                    		 else
                    		 var=var-1;
                         }
                    	 
                     }
                     counter++;
                }
                return counter;
        	}
        if(n==1)
        return 0;
        while(n!=1)
        {
            if(n%2==0)
             n=n/2;
             else
             {
                 if(n==3)
                 {
                     n=n-1;
                 }
                 else
                 {
            		 temp=n-1;
            		 temp=temp/2;
            		 if(temp%2!=0)
            		 n=n+1;
            		 else
            		 n=n-1;
                 }
            	 
             }
             counter++;
        }
        return counter;
    }
}
