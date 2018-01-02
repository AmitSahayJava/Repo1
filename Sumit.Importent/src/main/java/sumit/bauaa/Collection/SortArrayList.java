package sumit.bauaa.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * (10)	Suppose there is an Employee class. We add Employee class objects
 *  to the ArrayList. Mention the steps need to be taken , if I want to sort the objects 
 * in ArrayList using the employeeId attribute present  in Employee class.
 */

class Employee{
	private int employeeId;
	private String name;
	
	public Employee(int employeeId,String name){
		this.employeeId=employeeId;
		this.name=name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		
		return employeeId+" "+name;
	}
	
}

public class SortArrayList {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(new Employee(2, "Sumit"));
		l.add(new Employee(5, "Amit"));
		l.add(new Employee(9, "Rishav"));
		l.add(new Employee(1, "Nikhil"));
		l.add(new Employee(14, "Sania"));
		
		//Sorting ArrayList using Collections(c) sort()
		Collections.sort(l,new MyComparator());
		System.out.println(l);
	}

}

class MyComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Employee ref1=(Employee)o1;
		Employee ref2=(Employee)o2;
		if(ref1.getEmployeeId()<ref2.getEmployeeId()){
			return 1;
		}else if(ref1.getEmployeeId()>ref2.getEmployeeId()){
			return -1;
		} else
			return 0;
	}
}
