//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 *Class that replaces strings in a list using an iterator
 */
public class IteratorReplacer {
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	/**Constructor that takes in three strings
	 * @param line the list of strings
	 * @param rem the string to remove
	 * @param rep the replacement string
	 */
	public IteratorReplacer(String line, String rem, String rep) {
		setEmAll(line, rem, rep);
	}

	/**
	 * @param line the list of strings
	 * @param rem the string to remove
	 * @param rep the replacement string
	 */
	public void setEmAll(String line, String rem, String rep) {
		list = new ArrayList<>(Arrays.asList(line.split(" ")));
		toRemove = rem;
		replaceWith = rep;
	}

	/**
	 * Replaces all occurences of toRemove with replaceWidth
	 */
	public void replace() {
		
		//you could do this in a lot less lines of code if you just use streams
		ListIterator<String> iter = list.listIterator();
		while(iter.hasNext()) {
			String test = iter.next();
			if(test.equals(toRemove)) {
				iter.set(replaceWith);
			}
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return list.toString()+"\n\n";
	}
}