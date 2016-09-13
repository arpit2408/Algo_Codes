/**
 * 
 */
package Microsoft_Probs;

/**
 * @author arpit2408
 *
 */
public class NumericString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		    System.out.println(isNumber("46.e3"));

	}
	public static boolean isNumber(String s) {
		String str=s.trim();
		if(str.length()==0)
			return false;
		if(str.startsWith("e"))
			return false;
		if(str.endsWith("e"))
			return false;
		int counter=0;
		int counterfore=0;
		int counterforchar=0;
		boolean flag=true;
		for(int i=0;i<=str.length()-1;i++)
			{
				char c=str.charAt(i);
				if(flag)
				{
					if(c=='-' || c=='+')
					{
						flag=false;
						continue;
						
					}
				}
				if (!(c >= '0' && c <= '9') )
				{
					if((c=='.'))
						counter++;
					else if((c=='e'))
					{
					    
						    counterfore++;
					}
					else
					{
						return false;
					}
				}
				flag=false;
				if(c >= '0' && c <= '9')
				counterforchar++;
			}
		if(counterforchar==0)
			return false;
		if(counter==1 && str.length()==1)
			return false;
		if(counterfore==1 && str.length()==1)
			return false;
		if(counterfore>1)
			return false;
		if(counter>1)
			return false;
		return true;
    }

}
