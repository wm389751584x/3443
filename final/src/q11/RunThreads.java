package q11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunThreads {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		int[] numbers1 = {0, 2, 4, 6, 8};
		int[] numbers2 = {1, 3, 5, 7, 9};
		executor.execute(new ThreadToRun(numbers1));
		executor.execute(new ThreadToRun(numbers2));
		executor.shutdown();
	}
}
