package sumit.bauaa.IterateList_Set_Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyListIterator {

	public static void main(String[] args) {
		Employee e1=new Employee(10, "Amit Kumar", 38000, "Software Developer");
		Employee e2=new Employee(12, "Sumit Kumar", 68000, "Manager");
		Employee e3=new Employee(16, "Rishav", 32000, "fresher");
		Employee e4=new Employee(19, "Amanda cerny", 53000, "Sexy");
		Employee e5=new Employee(21, "Sania Mirza", 61000, "Sexy");
		
		
		List ref=new ArrayList<Employee>();
		ref.add(e1); ref.add(e2);  ref.add(e3);
		ref.add(e4); ref.add(e5);
		
        /*Iterate OBJECTS FROM THE LIST*/
		Iterator<Employee> itr=ref.iterator();
		//SIMPLE ITERATE
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		while(itr.hasNext()){
			Employee emp=itr.next();
			if(emp.getSalary()>50000){
				System.out.println(emp);
			} 
		}
	}

}
