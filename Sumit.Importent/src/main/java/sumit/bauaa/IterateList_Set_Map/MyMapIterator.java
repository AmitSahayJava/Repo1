package sumit.bauaa.IterateList_Set_Map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;  
import java.util.Map;

public class MyMapIterator {

	public static void main(String[] args) {
		Map mapRef=new Hashtable();
        mapRef.put("a", new Employee(10, "Amit Kumar", 38000, "Software Developer"));
        mapRef.put("b", new Employee(12, "Sumit Kumar", 68000, "Manager"));
        mapRef.put("c", new Employee(16, "Rishav", 32000, "fresher"));
        
               
        List<Employee> listRef=new ArrayList(mapRef.values());
        System.out.println(listRef);
        Iterator<Employee> itr=listRef.iterator();
        
        while(itr.hasNext()){
        	//System.out.println("while");
        	Employee emp=itr.next();
        	if(emp.getId()>=15){
        		System.out.println(emp);
        	}
        }
	}

}
