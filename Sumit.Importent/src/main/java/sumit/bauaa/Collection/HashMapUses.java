package sumit.bauaa.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 *Write java code showing insertion,deletion and retrieval of HashMap object ?     
 * */

public class HashMapUses {

	public static void main(String[] args) {
		Map mapReference=new HashMap();
		//insertion into HashMap
        mapReference.put("a", "Apple");
        mapReference.put("e", "Ball");
        mapReference.put("c", "Cat");
        mapReference.put("f", "Dog");
        System.out.println(mapReference);
        //deletion from HashMap
       // mapReference.remove("d");
        //retrieval from HashMap
              //First convert Map to Collection(List or Set)
//        List l=new ArrayList(mapReference.entrySet());
//        Iterator itr=l.iterator();
//        while(itr.hasNext()){
//        	System.out.println(itr.next());
//        }
        
	}

}
