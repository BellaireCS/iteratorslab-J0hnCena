import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//� A+ Computer Science  -  www.apluscompsci.com
//Name - Joshua Wong
//Date - You can just check my commit
//Class - you should know
//Lab  - same


/**
 *Runner for the IteratorRemover class
 */
public class IteratorRemoverRunner {
	
	public static void main (String[] args) {
		String line = null;
		String remove = null;
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter a string with spaces:");
			line = reader.readLine();
			System.out.println("What would you like to delete?:");
			remove = reader.readLine();
		} catch (IOException ioEx) {
			ioEx.printStackTrace();
		}

		if(line != null && remove != null) {
			IteratorRemover remover = new IteratorRemover(line, remove);
			remover.remove();
			System.out.println(remover);
		}
	}
}