package sumit.bauaa.IterateList_Set_Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ADD Student OBJECT INTO THE ARRAY LIST AND ITERATE IT
 */
public class TestCollection3 {

	public static void main(String[] args) {
		List list=new ArrayList<Student>();
		list.add(new Student(1, "Nikhil", 24));
		list.add(new Student(3, "Rishav", 21));
		list.add(new Student(5, "Krishna", 5));
		list.add(new Student(9, "small Leone", 9));
		list.add(new Student(11, "Sunny Leone", 37));
		
		Iterator<Student> iterate=list.iterator();
		while(iterate.hasNext()){
			Student student=iterate.next();
			int age=student.getAge();
			if(age<10){
				System.out.println(student.getId()+"   "+student.getName());
			}
		}
	}

}
