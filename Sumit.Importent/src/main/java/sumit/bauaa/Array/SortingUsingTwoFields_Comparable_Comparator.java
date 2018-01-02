package sumit.bauaa.Array;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Teacher{
	private int id;
	private String class_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String toString(){
		return id+" "+class_name;
	}
	
}

public class SortingUsingTwoFields_Comparable_Comparator {

	public static void main(String[] args) {
		Teacher t1=new Teacher(); t1.setId(1); t1.setClass_name("Physics");
		Teacher t2=new Teacher(); t2.setId(2); t2.setClass_name("Physics");
		Teacher t4=new Teacher(); t4.setId(2); t4.setClass_name("Mathematics");
		Teacher t3=new Teacher(); t3.setId(1); t3.setClass_name("Chemistry");
		Set set=new TreeSet(new MyComparator());
		set.add(t1);set.add(t2);set.add(t3); set.add(t4);
		System.out.println(set);

	}

}

class MyComparator implements Comparator<Teacher>{
	public int compare(Teacher t1,Teacher t2){
		int id1=t1.getId();
		int id2=t2.getId();
		if(id1>id2){
			return +1;
		} else if(id1<id2){
			return -1;
		}
		//IF id IS SAME THEN USE class_name TO SORT OBJECTS
		else if(id1==id2){
			String classname1=t1.getClass_name();
			String classname2=t2.getClass_name();
			return classname1.compareTo(classname2);
		}
		return 0;
	}
}
