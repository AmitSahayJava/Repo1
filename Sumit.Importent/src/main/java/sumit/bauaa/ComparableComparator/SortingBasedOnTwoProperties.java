package sumit.bauaa.ComparableComparator;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class Teacher{
	private String name;
	private String subject;
	public String getName() {
		return name;
	}	
	public String getSubject() {
		return subject;
	}	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", subject=" + subject + "]";
	}	
}
class MyComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Teacher t1=(Teacher)o1;
		Teacher t2=(Teacher)o2;
		/*FIRST OUR CODE WILL COMPARE TWO Teacher's OBJECT BY NAME*/
		int result=t1.getName().compareTo(t2.getName());
		if(result<0){
			return -1;
		}else if(result>0){
			return +1;
		}else
			/*IF NAME IS SAME THEN COMPARE BASED ON THERE SUBJECT*/
		return t2.getSubject().compareTo(t1.getSubject());
	}
}

public class SortingBasedOnTwoProperties {
	public static void main(String[] args) {
		NavigableSet s=new TreeSet(new MyComparator());
		Teacher t1=new Teacher("Sumit", "Business Management");
		Teacher t2=new Teacher("Leah Gotty", "Sex");
		Teacher t3=new Teacher("Nikhil", "Physics");
		Teacher t4=new Teacher("Amit", "Software");
		Teacher t5=new Teacher("Rishav", "Math");
		Teacher t6=new Teacher("Gaurav", "Chodna");
		Teacher t7=new Teacher("Gaurav", "Gar-Maarna");
		s.add(t1);s.add(t2);s.add(t3);s.add(t4);s.add(t5);s.add(t6);s.add(t7);
		System.out.println(s);
	}
}
