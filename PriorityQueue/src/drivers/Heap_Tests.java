package drivers;

import java.util.ArrayList;

import employee.Employee;
import employee.NameComparator;
import employee.PayComparator;
import heap.Heap;

/**
 * Class used to test the functionality of the Heap class
 * 
 * @author William Kelly
 *
 */
public class Heap_Tests {
	public static void runTests(ArrayList<Employee> emps){
		
		Heap<Employee> a = new Heap<Employee>(emps, new NameComparator());
		Heap<Employee> b = new Heap<Employee>(emps, new PayComparator());

		Employee c9 = new Employee("Z", 7);

		System.out.println("Starting Heap tests using NameComparator");
		System.out.println("Printing unordered heap");
		System.out.println(a.getString());
		System.out.println("Building min heap and sorting");
		a.heapSort();
		System.out.println(a.getString());
		System.out.println("Inserting Employee (Z , 7)");
		a.insert(c9);
		System.out.println(a.getString());
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		System.out.println("Starting Heap tests using PayComparator");
		System.out.println("Printing unordered heap");
		System.out.println(b.getString());
		System.out.println("Building min heap and sorting");
		b.heapSort();
		System.out.println(b.getString());
		System.out.println("Inserting Employee (Z , 7)");
		b.insert(c9);
		System.out.println(b.getString());
		
		System.out.println("-----------------------------------------------------------------------------------------");

	}
}
