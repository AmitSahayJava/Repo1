package sumit.bauaa.ComparableComparator;
import java.util.Comparator;
import java.util.TreeSet;


public class ComparatorDemo_anoymousObject {
	public static void main(String[] args) {
	    TreeSet set=new TreeSet(new Comparator(){
	        public int compare(Object o1,Object o2){
	        	StudentBean s1=(StudentBean)o1;
	        	StudentBean s2=(StudentBean)o2;
	        	
	        	return s1.getSname().compareTo(s2.getSname());
	        }
	    	
	    });
	    set.add(new StudentBean(10,"Sumit"));
	    set.add(new StudentBean(10,"Amit"));
	    set.add(new StudentBean(10,"Nikhil"));
	    set.add(new StudentBean(10,"Rishav"));
	    set.add(new StudentBean(10,"Pato"));	
	    System.out.println(set);
	}
}

                
