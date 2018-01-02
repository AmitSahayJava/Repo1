package sumit.bauaa.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String arg[]) {
		TreeSet t = new TreeSet(new MyComparator2());
		t.add(10);
		t.add(5);
		t.add(15);
		t.add(20);
		t.add(0);
		System.out.println(t);
	}

}

class MyComparator2 implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		if (I1 < I2)
			return +1;
		else if (I1 > I2)
			return -1;
		else
			return 0;
	}
}