package q9;

public class Compare<T extends Comparable<T>> {
	private T val1, val2;
	public Compare(T val1, T val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public boolean lessThan() {
		return val1.compareTo(val2) < 0;
	}
}
