package sumit.bauaa.Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue<String>(20, new MyPriority());
		q.add("Sumit Kumar");
		q.offer("Amit Kumar");
		q.offer("Nikhil anand");
		q.offer("Gaurav chudakkar");
		q.add("Rishav");
		System.out.println(q);
	}

}

class MyPriority implements Comparator{
	public int compare(Object o1, Object o2){
		String name1=(String)o1;
		String name2=(String)o2;
		return name1.compareTo(name2); //Reverse of alphabetical order (EX: z,y,x,....)
	}
}
