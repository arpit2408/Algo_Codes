/**
 * 
 */
package Solutions;

import java.util.ArrayList;

/**
 * @author arpit2408
 *
 */
public class ResizingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(lastRemaining(5214));
	}
	public static int lastRemaining(int n) {
        int element=1;
        int finalnumber=0;
        ArrayList<Integer> removeints=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
        	removeints.add(element++);
        }
        boolean flag=true;
        int counter=0;
        while(flag)
        {
        	if(removeints.size()==1)
            {
            	break;
            }
            for(int i=0;i<removeints.size();i++)
            {
            	removeints.remove(i);
            }
            if(removeints.size()==1)
            {
            	break;
            }
            for(int i=removeints.size()-1;i>=0;i=i-2)
            {
            	if(removeints.size()==1)
                {
                	break;
                }
            	removeints.remove(i);
            }
            if(removeints.size()==1)
            {
            	break;
            }
        }
        return removeints.get(0);
    }
}
