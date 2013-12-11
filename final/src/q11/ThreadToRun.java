package q11;

public class ThreadToRun implements Runnable {

	private int[] array;
	
	public ThreadToRun(int[] array) {
		this.array = array;
	}
	
	@Override
	public void run() {
		for (int a : array) {System.out.print(a);}
	}

}
