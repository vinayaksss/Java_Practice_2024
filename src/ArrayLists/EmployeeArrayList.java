package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeArrayList {
	
	public static void main(String arg[]) {
		
		List<Employee>emplist= new ArrayList<Employee>();
		emplist.add(new Employee("Jack",350000,"Hyd"));
		emplist.add(new Employee("Craack",450000,"Rcs"));
		emplist.add(new Employee("Arock",390000,"che"));
		//
		Collections.sort(emplist, new mySort());
		System.out.println(emplist);
		Collections.sort(emplist,new mySort());
	}
}
	class mySort implements Comparator<Employee>{
		
		public int compare(Employee o1,Employee o2) {
			
			//return o1.getName().compareTo(o2.getName());
			
			return o1.getSalary()-o2.getSalary();
			
			
	
	
	}	

}

