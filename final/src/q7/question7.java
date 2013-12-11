package q7;

import java.util.Iterator;



public class question7 {

	public static void main(String[] args) {
		/*String s = "The rain in Spain falls mainly on the plain.";
        CharLoop blah = new CharLoop(s);
        while(blah.hasNext()) {
        	System.out.print(blah.next());
        	System.out.print(",");                        this works too
        }*/
		CharLoop cl = new CharLoop("The rain in Spain falls mainly on the plain.");
		Iterator<Character> iter = cl.iterator();
		while(iter.hasNext()) {
			char c = iter.next();
			System.out.print(c + ",");
		}
	}

}
