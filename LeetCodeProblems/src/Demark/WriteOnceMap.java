/**
 * 
 */
package Demark;

import java.util.HashMap;
import java.util.Map;

/**
 * @author arpit2408
 *
 */




public class WriteOnceMap<K, V> extends HashMap<K, V> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public V put(K key, V value) {
        if (containsKey(key))
            throw new IllegalArgumentException(key + " already in map");

        return super.put(key, value);
    }


    public void putAll(Map<? extends K, ? extends V> m) {
        for (K key : m.keySet())
            if (containsKey(key))
                throw new IllegalArgumentException(key + " already in map");

        super.putAll(m);
    }
}


