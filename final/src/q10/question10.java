package q10;

public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saver<Integer> saver1 = new Saver<Integer>(13);
		System.out.println(saver1.save(42));     // prints 13
		System.out.println(saver1.save(-999));   // prints 42
		System.out.println(saver1.save(2013));   // prints -999
		
		Saver<String> saver2 = new Saver<String>("foo");
		System.out.println(saver2.save("bar"));  // prints foo
		System.out.println(saver2.save("why"));  // prints bar
		System.out.println(saver2.save("yar"));  // prints why

	}

}
