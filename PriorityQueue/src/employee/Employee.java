package employee;

/**
 * Employee class used to test the priority queue
 * 
 * @author William Kelly
 */
public class Employee{
	
	/**
	 *	Name of the employee held in a String 
	 */
	private final String NAME;
	
	/**
	 * double value for the PayRate of the employee 
	 */
	private double payRate;
	
	/**
	 * Constructor used to create an employee with a name, and payrate
	 * 
	 * @param NAME		Name of the employee
	 * @param PAYRATE	PayRate of the employee
	 */
	public Employee(String NAME, double PAYRATE){
		this.NAME = NAME;
		this.payRate = PAYRATE;
	}
	
	/**
	 * This method returns the name of the employee
	 * 
	 * @return	Name of the employee
	 */
	public String getName() {
		return NAME;
	}
	
	/**
	 * This method returns the payRate of the employee
	 * 
	 * @return payRate of the employee
	 */
	public double getPay() {
		return payRate;
	}
	
	 /**
	 *	This method returns a String representation of the Employee object, consisting of the employees name and payRate
	 */
	public String toString(){
		return getName()+", "+ getPay();  
	 }  

	

}
