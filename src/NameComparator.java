package Assignment2;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	/**
	 * method compares two objects
	 * 
	 * @params obj and objCompare (obj being compared to)
	 */
	public int compare(Employee obj, Employee objCompare) {
		return obj.getName().compareTo(objCompare.getName());
	}
}
