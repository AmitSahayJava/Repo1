package sumit.bauaa.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Write the code for iterating the list in different ways in java ? 
 * */
public class ListIterator {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("amit");
		list.add("sumit");
		list.add("papa");
		list.add("mummi");
		list.add("nikhil");
		list.add("rishav");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			list.add("Sunny"); //java.util.ConcurrentModificationException 
			//Because we try to add in list Object directly. 
			System.out.println(itr.next());
		}		
	}
}
