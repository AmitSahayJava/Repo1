package sumit.bauaa.ComparableComparator;

import java.util.TreeSet;

public class UsingComparable { 
	public static void main(String[] args) { 
		Employee e1=new Employee(1, "Sumit Kumar"); 
		Employee e2=new Employee(2, "Amit Kumar"); 
		Employee e3=new Employee(5, "Sunny Leone");
		Employee e4=new Employee(4, "Amanda Cerny"); 
		Employee e5=new Employee(3, "Rock"); 
		TreeSet t=new TreeSet(); 
		t.add(e1); t.add(e2); t.add(e3); t.add(e4); t.add(e5);
		System.out.println(t); 
	}
}
