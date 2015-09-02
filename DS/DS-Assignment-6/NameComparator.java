

import java.util.Comparator;


public class NameComparator implements Comparator {

	public int compare(Object arg1, Object arg2) {
		Employee emp1 = (Employee) arg1;
		Employee emp2 = (Employee) arg2;
		return emp1.getName().compareTo(emp2.getName());
	}

	
		
}
