package lab9;

import java.util.HashMap;

public class DualHashMap<K, V> implements DualMap<K, V> {
	
	HashMap<Object, Object> kV;
	HashMap<Object, Object> vK;
	
	public DualHashMap(){
		kV = new HashMap<Object, Object>();
		vK = new HashMap<Object, Object>();
	}

	@Override
	public void put(K key, V value) {
		// TODO Auto-generated method stub
		if(kV.put(key, value) != null){
			this.remove(key, value);			
		}
				
		kV.put(key, value);
		vK.put(value, key);
		
	}

	@Override
	public void remove(K key, V value) {
		// TODO Auto-generated method stub
		kV.remove(value);
		vK.remove(key);
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		Object temp = null;
		if (kV.get(key) != null)
		   temp = kV.get(key);
		
		return (V) temp;
	}

	@Override
	public K reverseGet(V value) {
		// TODO Auto-generated method stub
		Object temp = null;
		if(vK.get(value) != null)
		   temp = (K) vK.get(value);
		
		return (K) temp;
	}

}
