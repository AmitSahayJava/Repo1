package sumit.bauaa.ComparableComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		// IF USER IS NOT SATISFIED WITH DEFAULT NATURAL SORTING THEN HE CAN IMPLEMENT CUSTOMIZE
		//SORTING USING COMPARATOR

		Person p1=new Person(); p1.setName("Sumit");p1.setMobile("9470943875");p1.setAddress("Patna");
		Person p2=new Person();p2.setName("Amit");p2.setMobile("7091043605");p2.setAddress("Mumbai");
		Person p3=new Person();p3.setName("Rahul");p3.setMobile("9488902347");p3.setAddress("Kolkata");
		Person p4=new Person();p4.setName("Sachin"); p4.setMobile("7003728432"); p4.setAddress("Mumbai");  
		Person p5=new Person();p5.setName("Sania"); p5.setMobile("8074032045"); p5.setAddress("Hyderabad");  
		Person p6=new Person();p6.setName("Rock"); p6.setMobile("8078323632"); p6.setAddress("US");  
		Person p7=new Person();p7.setName("Amitabh"); p7.setMobile("9487008897"); p7.setAddress("Mumbai");  
		Person p8=new Person();p8.setName("Amanda"); p8.setMobile("7089982310"); p8.setAddress("Patna");  
//--------I AM SATISFIED WITH D.N.S.O---------------
		TreeSet tree=new TreeSet();
		tree.add(p1);tree.add(p2);tree.add(p3);tree.add(p4);tree.add(p5);tree.add(p6);
		tree.add(p7);tree.add(p8);
		System.out.println(tree);
		
//--------I AM GOING FOR CUSTOMIZE SORTING-----------		
		TreeSet tree1=new TreeSet(new CustomizeSorter());
		tree1.add(p1);tree1.add(p2);tree1.add(p3);tree1.add(p4);tree1.add(p5);tree1.add(p6);
		tree1.add(p7);tree1.add(p8);
		System.out.println(tree1);
	}

}
// SORTING BASED ON MOBILE NUMBER
class CustomizeSorter implements Comparator{
	public int compare(Object o1,Object o2){
		Person p1=(Person)o1;
		Person p2=(Person)o2;
		return p1.getMobile().compareTo(p2.getMobile());
	}
}
