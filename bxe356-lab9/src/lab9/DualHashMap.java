package lab9;

import java.util.HashMap;

public class DualHashMap<K, V> implements DualMap<K, V> {
	
	HashMap<Object, Object> kV;
	HashMap<Object, Object> vK;
	
	/*
	 * creates two hashmaps
	 */
	public DualHashMap(){
		kV = new HashMap<Object, Object>();
		vK = new HashMap<Object, Object>();
	}
	
	
	/*
	 * matches keys to values 
	 * and values to keys and doesn't allow duplicates
	 */
	@Override
	public void put(K key, V value) {
		// TODO Auto-generated method stub
		   kV.remove(vK.get(value));
		   vK.remove(kV.get(key));
		   kV.put(key, value);
		   vK.put(value, key);
		
	}

	
	/*
	 * remove keys from the key to value hashmap and
	 * removes values from the value to keys hashmap
	 */
	@Override
	public void remove(K key, V value) {
		// TODO Auto-generated method stub
		kV.remove(key);
		vK.remove(value);
	}

	
	
	/*
	 * gets the value from the key it's mapped to
	 */
	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		Object temp = null;
		if (kV.get(key) != null)
		   temp = kV.get(key);
		
		return (V) temp;
	}

	/*
	 * gets the key from the value that's it's mapped to
	 */
	@Override
	public K reverseGet(V value) {
		// TODO Auto-generated method stub
		Object temp = null;
		if(vK.get(value) != null)
		   temp = (K) vK.get(value);
		
		return (K) temp;
	}

}
