package sumit.bauaa.IterateList_Set_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Store_data_into_HashMap_and_iterate_it {

	public static void main(String[] args) {
		Map ref=new HashMap();
        ref.put("a", "Apple");
        ref.put("b", "Ball");
        ref.put("c", "Cat");
        ref.put("d", "Dog");
    /*MAP CAN NOT ITERATE*//*SO CONVERT IT INTO COLLECTION */
        List l=new ArrayList(ref.entrySet());
        Iterator itr=l.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next().toString());
        }
	}

}
