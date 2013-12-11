package q8;

public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This prints 1 2 3 4 5 6 7 8 9
		for (int i : new IntegerLoop(1,9)) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		// This prints -3 -2 -1 0 1 2 3
		for (int i : new IntegerLoop(-3,3)) {
			System.out.print(i + " ");
		}
		
		System.out.println();

	}

}
