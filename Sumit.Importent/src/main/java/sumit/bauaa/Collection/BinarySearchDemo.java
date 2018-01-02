package sumit.bauaa.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchDemo {
	public static void main(String[] args) {
		String alphabet="S";
		List l=new ArrayList();
		l.add("A");
		l.add("S");
		l.add("N");
		l.add("G");
		l.add("R");
		Collections.sort(l);
		System.out.println(l);
		int i=Collections.binarySearch(l, alphabet);// this method returns int value
		System.out.println("Your alphabet: "+alphabet+" is at "+i+" index");
	}

}
