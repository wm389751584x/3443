package q9;

public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compare c = new Compare(13, 42);
		System.out.println(c.lessThan());
		
		c = new Compare("foo", "bar");
		System.out.println(c.lessThan());

	}

}
