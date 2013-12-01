package lab10;

public class SortingThread implements Runnable {

	private int temp;
	private int[] tempA;
	private SortingBuffer buffer;
	
	public SortingThread(int i, int[] array, SortingBuffer buffer) {
		temp = i;
		tempA = array;
		this.buffer = buffer;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i = 0; i < tempA.length; i++) {
			   buffer.waitUntilMinimum(temp, tempA[i]);
			   System.out.println(temp + " unsynchronized " + tempA[i]);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		buffer.finished(temp);
	}

}

