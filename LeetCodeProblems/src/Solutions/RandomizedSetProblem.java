/**
 * 
 */
package Solutions;
import java.util.*;
/**
 * @author arpit2408
 *
 */
public class RandomizedSetProblem {

	/**
	 * @param args
	 */
	    ArrayList<Integer> nset;
	    int size;
	    int random;
	    /** Initialize your data structure here. */
	    public RandomizedSetProblem() {
	       nset =new ArrayList<Integer>();
	       size=0;
	       Random rand= new Random();
	       int  random = rand.nextInt(50) + 1;
	    }
	    
	    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	    public boolean insert(int val) {
	        return (nset.add(val));
	    }
	    
	    /** Removes a value from the set. Returns true if the set contained the specified element. */
	    public boolean remove(int val) {
	        return (nset.remove(Integer.valueOf(val)));
	        
	    }
	    
	    /** Get a random element from the set. */
	    public int getRandom() {
	        return nset.get(random);
	    }

	/**
	 * Your RandomizedSet object will be instantiated and called as such:
	 * RandomizedSet obj = new RandomizedSet();
	 * boolean param_1 = obj.insert(val);
	 * boolean param_2 = obj.remove(val);
	 * int param_3 = obj.getRandom();
	 */
	public static void main(String[] args) {

	}

}
