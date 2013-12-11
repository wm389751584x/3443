package q8;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntegerLoop implements Iterator<Integer>, Iterable<Integer> {

	private int a;
	private int b;
	
	public IntegerLoop(int start, int end) {
		a = start;
		b = end;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new IntegerLoop(a, b);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return a <= b;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		if (hasNext()) {
			int initial = a++;
			return initial;
		} 
		else throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
