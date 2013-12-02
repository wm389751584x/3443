package lab10;

import java.util.Arrays;

public class SortingThread implements Runnable {

	private int temp;
	private int[] tempA;
	private SortingBuffer buffer;
	
	/**
	 * 
	 * @param i = thread number
	 * @param array = array to sort
	 * @param buffer = buffer used to synchronize arrays
	 */
	public SortingThread(int i, int[] array, SortingBuffer buffer) {
		temp = i;
		Arrays.sort(array);
		tempA = array;
		this.buffer = buffer;
	}

	/**
	 * prints out the unsynchronized and synchronized arrays
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < tempA.length; i++) {
		   System.out.println(temp + " unsynchronized " + tempA[i]);
		}		
		
		try {
			for(int i = 0; i < tempA.length; i++) {
			   buffer.waitUntilMinimum(temp, tempA[i]);
			   System.out.println(temp + " synchronized " + tempA[i]);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		buffer.finished(temp);
	}

}

