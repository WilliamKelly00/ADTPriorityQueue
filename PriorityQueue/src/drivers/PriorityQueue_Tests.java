package drivers;

import java.util.ArrayList;

import employee.Employee;
import employee.NameComparator;
import employee.PayComparator;
import priorityQueue.PriorityQueue;


/**
 * Class used to test the functionality of the PriorityQueue class
 * 
 * @author William Kelly
 */
public class PriorityQueue_Tests {
	public static void runTests(ArrayList<Employee> emps){

		//Creating a heap for both comparators
		PriorityQueue<Employee> a = new PriorityQueue<Employee>(emps, new NameComparator());
		PriorityQueue<Employee> b = new PriorityQueue<Employee>(emps, new PayComparator());

		Employee c9 = new Employee("Z", 7);

		System.out.println("Starting PriorityQueue tests using NameComparator");
		System.out.println("Printing unordered PriorityQueue");
		System.out.println(a.getString());
		System.out.println("Building min heap and sorting");
		a.sort();
		System.out.println(a.getString());
		System.out.println("Inserting Employee (Z , 7)");
		a.add(c9);
		System.out.println(a.getString());

		System.out.println("-----------------------------------------------------------------------------------------");

		System.out.println("Starting PriorityQueue tests using PayComparator");
		System.out.println("Printing unordered PriorityQueue");
		System.out.println(b.getString());
		System.out.println("Building min heap and sorting");
		b.sort();
		System.out.println(b.getString());
		System.out.println("Inserting Employee (Z , 7)");
		b.add(c9);
		System.out.println(b.getString());

		System.out.println("-----------------------------------------------------------------------------------------");


	}
}
