package q4;

import java.util.Random;

public class SafeAdd {
	public static Integer add(Integer a, Integer b) {
		if (a > 0 && b > 0 && a + b < 0) {
			throw new ArithmeticException("integer overflow");
		} else if (a < 0 && b < 0 && a + b > 0) {
			throw new ArithmeticException("integer underflow");
		} else {return a + b;}
		
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		Integer[] array = { 1234567890, -1234567890, null };
		
		
		try {			
			int a = array[random.nextInt(3)];
			int b = array[random.nextInt(3)];
			int c = add(a, b);
			System.out.println("no exception");
		} catch (ArithmeticException e) {
			System.out.println("arithmetic exception");			
		} catch (NullPointerException e) {
			System.out.println("null exception");
		}
		
		
	}
}
