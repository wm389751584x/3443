package q7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CharLoop implements Iterator<Character>, Iterable<Character>{
	
	private String s;
	private int nextIndex;
	
	public CharLoop(String string) {
		s = string;
		nextIndex = 0;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return 0 <= nextIndex && nextIndex < s.length();
	}

	@Override
	public Character next() {
		// TODO Auto-generated method stub
		if (hasNext()) {
			Character result = s.charAt(nextIndex);
			nextIndex++;
			return result;
		} 
		else throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<Character> iterator() {
		// TODO Auto-generated method stub
		return new CharLoop(s);
	}

}
