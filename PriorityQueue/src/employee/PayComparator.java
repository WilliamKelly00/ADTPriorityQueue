package employee;

import java.util.Comparator;

/**
 * This class is used to compare the payRate of two Employee objects
 * 
 * @author William Kelly
 *
 */
public class PayComparator implements Comparator<Employee>{

	/**
	 *	This method compares the payRate of two Employee objects using the double compare function
	 */
	public int compare(Employee a, Employee b) {
		return Double.compare(a.getPay(), b.getPay());
	}
}
