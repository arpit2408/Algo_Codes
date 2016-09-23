/**
 * 
 */
package Solutions;

/**
 * @author arpit2408
 *
 */
public class RemoveKCharFromNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(removeKdigits("12",1));

	}
	public static String removeKdigits(String num, int k) {
		       String finalstr=null;
			        StringBuilder str=new StringBuilder();
			        StringBuilder strorg=new StringBuilder();
			        if(num.length()==k)
			        {
			            return "0";
			        }
			        else if(k==num.length()-1)
			        {
			            char min=num.charAt(0);
			            for(int i=0;i<num.length();i++)
			            {
			                if(min>num.charAt(i))
			                    min=num.charAt(i);
			            }
			            finalstr=Character.toString(min);
			            
			        }
			        else
			        {
			            StringBuilder tempstr=new StringBuilder();
			            strorg.append(num.substring(0,k+1));
			            while(true && strorg.length()>1)
			            {
			                char max='0';
			                for(int j=0;j<strorg.length();j++)
			                {
			                    if(max<strorg.charAt(j))
			                        max=strorg.charAt(j);
			                }
			                strorg.deleteCharAt(strorg.indexOf(Character.toString(max)));
			            }
			        tempstr.append(strorg.toString());
			        tempstr.append(num.substring(k+1,num.length()));
			        int l=0;
			        boolean flag=true;
			        while(flag && tempstr.length()>0)
			        {
			        	if(tempstr.charAt(l)=='0')
		                {
		                	tempstr.deleteCharAt(tempstr.indexOf(Character.toString(tempstr.charAt(l))));
		                	l=0;
		                }
		                else
		                flag=false;
			        }
			        if(tempstr.length()==0)
			        	finalstr="0";
			        else
			            finalstr=tempstr.toString();
			        }
			        return finalstr;

    }

}
