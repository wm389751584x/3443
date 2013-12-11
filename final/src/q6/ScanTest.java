package q6;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class ScanTest {
	
	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(new File("foobar.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("foobar.txt not found");
			System.exit(1);
		}
		
		int words = 0;
		int c = 0;
		String token = null;
		while(in.hasNext()) {
			words++;
			token = in.next();
			c = c + token.length();
		}
		System.out.println("avg length = " + c/words);
	}

}
