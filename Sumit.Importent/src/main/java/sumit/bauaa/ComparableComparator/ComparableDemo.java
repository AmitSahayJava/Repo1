package sumit.bauaa.ComparableComparator;

import java.util.TreeSet;

public class ComparableDemo {
	
//SORTING BASED ON COMPARABLE, COMPARATOR SAYS "INSIDE THE DATA STRUCTURE HOW OBJECTS SHOULD BE"
	       //  STORED

	public static void main(String[] args) {
		Person p1=new Person(); p1.setName("Sumit");p1.setMobile("9470943875");p1.setAddress("Patna");
		Person p2=new Person();p2.setName("Amit");p2.setMobile("7091043605");p2.setAddress("Mumbai");
		Person p3=new Person();p3.setName("Rahul");p3.setMobile("9488902347");p3.setAddress("Kolkata");
		Person p4=new Person();p4.setName("Sachin"); p4.setMobile("7003728432"); p4.setAddress("Mumbai");  
		Person p5=new Person();p5.setName("Sania"); p5.setMobile("8074032045"); p5.setAddress("Hyderabad");  
		Person p6=new Person();p6.setName("Rock"); p6.setMobile("8078323632"); p6.setAddress("US");  
		Person p7=new Person();p7.setName("Amitabh"); p7.setMobile("9487008897"); p7.setAddress("Mumbai");  
		Person p8=new Person();p8.setName("Amanda"); p8.setMobile("7089982310"); p8.setAddress("Patna");  

		TreeSet tree=new TreeSet();
		tree.add(p1);tree.add(p2);tree.add(p3);tree.add(p4);tree.add(p5);tree.add(p6);
		tree.add(p7);tree.add(p8);
		
		System.out.println("-----------------COMPARABLE INTERFACE DEMO---------------");
		System.out.println(tree);
	}

}

