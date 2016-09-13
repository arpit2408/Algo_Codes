/**
 * 
 */
package Solutions;

/**
 * @author arpit2408
 *
 */
public class PerfectSquares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=1234;
		for(int i=0;Math.pow(i, 2)<n;i++)
		{
			System.out.println(i*i);
		}

	}

}
