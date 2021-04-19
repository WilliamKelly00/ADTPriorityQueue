package employee;

import java.util.Comparator;

/**
 * This class is used to compare the names of two Employee objects
 * 
 * @author William Kelly
 */
public class NameComparator implements Comparator<Employee> {

	/**
	 *	This method compares the names of two Employee objects using the String compareTo function
	 */
	public int compare(Employee a, Employee b) {	
		return a.getName().compareTo(b.getName());
	}
}
