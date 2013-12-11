package q10;

import java.util.ArrayList;

public class Saver <T>{
	//private T val1;
	private ArrayList<T> list;
	private int index;
	
	public Saver(T val) {
		list = new ArrayList<T>();
		list.add(val);
		index = 0;
	}
	
	public T save(T val) {
		list.add(val);
		index++;
		return list.get(index - 1);
	}

}
