/**
 * 
 */
package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author arpit2408
 *
 */
public class AddOnetoNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] b={ 9  };
		System.out.println(plusOne(Arrays.asList(b)));
	}
	public static ArrayList<Integer> plusOne(List<Integer> a) {
		ArrayList<Integer> arrnew=new ArrayList<Integer>();
		ArrayList<Integer> finalarr=new ArrayList<Integer>();
	    int counter=0;
	    int counterforzero=0;
	    boolean flag=true;
	    boolean flagfornine=false;
	    for(int i=a.size()-1;i>0;i--)
	    {
	        if(a.get(i)==9 && flag)
	         {
	             a.set(i,0);
	             counter++;
	             if(a.get(i-1)!=9)
	             {
	                a.set(i-1,a.get(i-1)+1);
	                flagfornine=true;
	                break;
	             }
	         }
	         else
	         {
	             flag=false;
	             break;
	         }
	    }
	    if(a.size()-1==0)
	    {
	        if(a.get(0)==9)
	        {
	            arrnew.add(1);
	            a.set(0,0);
	            arrnew.addAll(a);
	        }
	        else
	        {
    	        a.set(0,a.get(0)+1);
    	    	arrnew.addAll(a);
	        }
	    	
	    }
	    else if(counter==a.size()-1 && flagfornine==false)
	    {
	        a.set(0,0);
	        arrnew.add(1);
	        arrnew.addAll(a);
	    }
	    else if(flagfornine==false)
	    {
	        a.set(a.size()-1,a.get(a.size()-1)+1);
	        arrnew.addAll(a);
	    }
	    else
	    {
	    	arrnew.addAll(a);
	    }
	    for(int i=0;i<arrnew.size();i++)
	    {
	        if(arrnew.get(i)==0)
	        counterforzero++;
	        else
	        break;
	    }
	    finalarr.addAll(arrnew.subList(counterforzero, arrnew.size()));
	    return  finalarr;
	    
	}
}
