package sumit.bauaa.IterateList_Set_Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection4 {

	public static void main(String[] args) {
		List list1=new ArrayList<String>();    List list2=new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
				
		list2.add("F");
		list2.add("G");
		list2.add("H");
		list2.add("I");
		
		list1.addAll(list2);
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext()){
			String character=itr.next();
			//PRINT EACH ELEMENTS WHICH COMES AFTER D
			if(character.equals("D")){
				while(itr.hasNext()){
					System.out.println(itr.next());
				}
			}
		}
	}

}
