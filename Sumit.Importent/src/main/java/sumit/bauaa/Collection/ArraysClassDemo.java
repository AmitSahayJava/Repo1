package sumit.bauaa.Collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysClassDemo {
	public static void main(String[] args) {
		int[] a={10,2,8,7,19,12};
		System.out.println("Our Array");
		for(int i:a){
			System.out.print(i+" ");;
		}
		Arrays.sort(a);
		System.out.println("\n"+"After Sorting of primitive array: ");
		for(int i:a){
			System.out.print(i+" ");
		}	
		///////////////////////////////////////////
		System.out.println();
		Object[] o={"A","Z","S","G","N","R"};
		for(Object obj:o){
			System.out.print(obj);
		}
		Arrays.sort(o, new ArraySorter());
		System.out.println("\n"+" After Sorting: ");
        for(Object obj:o){
        	System.out.print(obj);
        }
        System.out.println();
        String[] s={"Amit","Sumit","Gaurav chudakkar","Nikhil","Rishav"};
        List l=Arrays.asList(s);
        System.out.println(l);
        
	}
}
class ArraySorter implements Comparator{
	public int compare(Object o1,Object o2){
		String s1=(String)o1;
		String s2=(String)o2;
			return s2.compareTo(s1); //Reverse order
	}
}
