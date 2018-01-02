package sumit.bauaa.ComparableComparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringComparatorDemo1 {
	public void DefaultNaturalSortingOfStringObjects(){
		Set set2=new TreeSet<String>();
		set2.add("apple");
		set2.add("ball");
		set2.add("sumit");
		set2.add("amit");
		set2.add("sunny leone");
		Iterator itr2=set2.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}
	
	public void CustomizeSorting(){
		Set set = new TreeSet<String>(new MyStringComparator1());
		set.add("apple");
		set.add("ball");
		set.add("sumit");
		set.add("amit");
		set.add("sunny leone");
		/*Iterator is used to get Obect one by one*/
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		StringComparatorDemo1 instance=new StringComparatorDemo1();
		Scanner sc=new Scanner(System.in);
				
		System.out.println("If you are satisfied with DNSOrder press 1 or else press 2");
		int value=sc.nextInt();
		if(value==1){
			instance.DefaultNaturalSortingOfStringObjects();
		}else
			instance.CustomizeSorting();
	}

}

class MyStringComparator1 implements Comparator {
	public int compare(Object o1, Object o2) {
		String one=(String)o1;
		String two=(String)o2;
		/*IT WILL CAUSE OF REVERSE OF ALPHABETICAL ORDER*/
		return two.compareTo(one);
	}
}
