package drivers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import employee.Employee;

/**
 * Helper class that reads text from a file and inputs it into a ArrayList 
 * this is used to test the Heap and PriorityQueue class.
 *
 * Text must be in the format "First Last, PayRate/n"
 * 
 * @author William Kelly
 *
 */
public class Helper {

	public static void helper() {
		
		ArrayList<Employee> emps = new ArrayList<Employee>();

		try {
			File file = new File("test.txt");
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {                
				String line = scanner.nextLine();
				String array[] = line.split(", ");
				Employee employee  = new Employee (array[0],Double.parseDouble(array[1]));

				emps.add(employee);

			}
			scanner.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Heap_Tests.runTests(emps);
		
		PriorityQueue_Tests.runTests(emps);

	}

}
