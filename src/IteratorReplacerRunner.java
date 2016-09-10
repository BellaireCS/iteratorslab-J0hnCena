//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IteratorReplacerRunner {
	public static void main (String[] args) {
		String line = null;
		String remove = null;
		String replace = null;
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter a string with spaces:");
			line = reader.readLine();
			System.out.println("What would you like to delete?:");
			remove = reader.readLine();
			System.out.println("What would you like to use instead?:");
			replace = reader.readLine();
		} catch (IOException ioEx) {
			ioEx.printStackTrace();
		}
		
		if(line != null && remove != null && replace != null) {
			IteratorReplacer replacer = new IteratorReplacer(line, remove, replace);
			replacer.replace();
			System.out.println(replacer);
		}
	}
}