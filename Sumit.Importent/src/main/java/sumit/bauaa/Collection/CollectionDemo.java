package sumit.bauaa.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {		
        LinkedList list=new LinkedList();
        list.add("B.K.Sahay");
        list.add("SahayJi");
        list.add("Amit Kumar");
        list.add("Sumit Kumar");
        System.out.println("Before modification "+list);
       // ListIterator ltr=list.listIterator();
        Iterator ltr=list.iterator();
        while(ltr.hasNext()){
        	String name=(String)ltr.next();
        	if(name.equalsIgnoreCase("b.k.sahay")){
        		System.out.println("Data Ji is no more");
        		ltr.remove();
        		//list.add("God");
        	}        	
        }
        System.out.println("After Modification "+list);
        
        
        
	}
}






