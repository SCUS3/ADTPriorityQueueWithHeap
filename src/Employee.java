package Assignment2;

//In summary, the following three classes regarding an employee need to be designed:
//• Employee
//• A name comparator for employee, a class implementing the interface java.util.Comparator<T>.
//• Names should be compared lexicographically.
//• A pay rate comparator for employee, a class implementing the interface java.util.Comparator<T>.

public class Employee implements Comparable<Employee>{

	private String name;
	private int payRate;

	public Employee(String name, int payRate) {
		this.name = name;
		this.payRate = payRate;
	}
	
	public String toString() {
		return (name + " " + payRate);
	}

	public int compareTo(Employee EmployeeTwo) {
		return this.payRate - EmployeeTwo.payRate;
	}

	public int getPayRate() {
		return payRate;
	}

	public String getName() {
		return name;
	}
	
}
