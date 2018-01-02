package sumit.bauaa.IterateList_Set_Map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IterateMapObject {

	public static void main(String[] args) {
		Map ref=new Hashtable();
        ref.put("a", "Apple");
        ref.put("b", "Ball");
        ref.put("c", "Cat");
        ref.put("d", "Dog");
        /*ITERATE MAP*/
        /*WE CAN NOT ITERATE MAP, HENCE WE NEED TO CONVERT IT INTO COLLECTION(LIST,SET)*/
        
        List l1=new ArrayList(ref.keySet());
        List l2=new ArrayList(ref.values());
        List l3=new ArrayList(ref.entrySet());
        
        Iterator itr1=l1.iterator();
        while (itr1.hasNext()){
        	System.out.println(itr1.next());
        }
        Iterator itr2=l2.iterator();
        while(itr2.hasNext()){
        	System.out.println(itr2.next());
        }
        Iterator itr3=l3.iterator();
        while(itr3.hasNext()){
        	System.out.println(itr3.next());
        }
	}

}
