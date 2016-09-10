//� A+ Computer Science  -  www.apluscompsci.com
//Name - Joshua Wong
//Date - check my commit
//Class - you should know
//Lab  - same

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Class that removes a certain element from an arraylist of strings using an iterator
 */
public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	/**Constructor that takes in two strings
	 * @param line the list of strings
	 * @param rem which string to remove
	 */
	public IteratorRemover(String line, String rem) {
		setTest(line, rem);
	}

	/**
	 * @param line line the list of strings
	 * @param rem which string to remove
	 */
	public void setTest(String line, String rem) {
		list = new ArrayList<>(Arrays.asList(line.split(" ")));
		//emilia best grill not rem
		toRemove = rem;
	}

	/**
	 * removes the string to remove from the list
	 */
	public void remove() {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String item = it.next();
			if(item.equals(toRemove))
				it.remove();
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return list.toString();
	}
}