/**
 * 
 */
package Solutions;

import java.util.HashMap;
import java.util.Vector;

/**
 * @author arpit2408
 *
 */
public class CombinationSum {

	/**
	 * @param args
	 */
	
	        
	    
	static void permute(java.util.List<Integer> arr, int k)
	{
        for(int i = k; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, k);
            permute(arr, k+1);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            System.out.println(java.util.Arrays.toString(arr.toArray()));
        }
    }
	public static void main(String[] args) {
		permute(java.util.Arrays.asList(1,2,2), 0);
	}

		{
		int[] arr=new int[]{1,2,3};
		Vector<Integer> sumarr=new Vector<Integer>();
		HashMap<Integer,Integer> temparr=new HashMap<Integer,Integer>();
		int target=4;
		int flag=0;
		while(flag<arr.length)
		{
			sumarr.add(arr[flag]);
			int counter=1;
			do
			{
				sumarr.add(sumarr.lastElement()+arr[flag]);
				counter++;
				if(sumarr.lastElement()>target)
				{
					counter=0;
					flag++;
					break;
				}
			}
			while(sumarr.lastElement()!=target);
			if(counter!=0)
				temparr.put(arr[flag], counter);
			flag++; 
		}
		for(Integer i:temparr.keySet())
		{
			for(int j=0;j<temparr.get(i);j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		}
}


