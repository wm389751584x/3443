package q5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class question5 {
	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(new File("spain.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("spain.txt not found");
			System.exit(1);
		}
		
		TreeSet<String> set = new TreeSet<String>();
		while (in.hasNext()) {
			String token = in.next();
			set.add(token);
		}
		for (String s : set) {
			System.out.print(s + " ");
		}
	}
}
