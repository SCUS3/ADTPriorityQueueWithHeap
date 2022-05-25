package Assignment2;

import java.util.Comparator;

public class PayRateComparator implements Comparator<Employee>{

	
	/**
	 * method compares two objects
	 * @params obj and objCompare (obj being compared to)
	*/	
	public int compare(Employee obj, Employee objCompare) {
		if (obj.getPayRate() == objCompare.getPayRate()) {
			return 0;
		}
		else if((obj.getPayRate() > objCompare.getPayRate())) {
			return 1;
		}
		else {
			return -1;
		}
	}
}


