/**
 * 
 */
package Solutions;

/**
 * @author arpit2408
 *
 */
public class IndexofNumber {

	/**
	 * @param args
	 */
	int[] nums=new int[]{1,2,3,3,3};
	public static void main(String[] args) {
		System.out.println(new IndexofNumber().pick(3));

	}
	
    public int pick(int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
                return nums[i];
        }
        return 0;
    }

}
