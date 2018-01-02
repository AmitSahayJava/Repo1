package sumit.bauaa.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		List list=new ArrayList<String>();
		list.add("Sumit Kumar");
		list.add("Leah Gotti");
		list.add("Amanda cerny");
		list.add("Amit kumar");
		System.out.println("List insertion order is preserved: "+"\n"+list);
		Collections.sort(list); //DNSO
		System.out.println("After Default natural sorting: ");
		System.out.println(list);
		Collections.sort(list, new MyComparatorDemo());
		System.out.println("After Customize Sorting: ");
		System.out.println(list);
	}
}

class MyComparatorDemo implements Comparator{
	public int compare(Object o1,Object o2){
		String s1=(String)o1;
		String s2=(String)o2;
			return s2.compareTo(s1);
	}
}
