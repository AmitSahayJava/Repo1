package sumit.bauaa.IterateList_Set_Map;
/*
 * ADD ELEMENTS TO AL AND ITERATE
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestCollection1 {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("Amit Kumar");
		list.add("Sumit Kumar");
		list.add("Nikhil Anand");
		list.add("Rishav Kumar");
		list.add("Sania Mirza");
		//BY ITERATOR			
		Iterator itr=list.iterator();
		System.out.println("----------By Iterator-------------------");
		while(itr.hasNext()){
			String name=(String)itr.next();
			if(name.equals("Sumit Kumar")){
				System.out.println(name);
			}
		}
		System.out.println("-------------By For-Each loop--------------");
		//BY FOR EACH LOOP
		for(String name:list){
			System.out.println(name);
		}
	}

}
