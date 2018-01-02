package sumit.bauaa.Collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

class Keys{
	private int id;
	public Keys(int id){
		this.id=id;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object o) {
		Keys k=(Keys)o;
		if(this.id==k.id){
		   return true;
		}else
			return false;
	}
	@Override
	public String toString() {
		return id+" ";
	}
}

public class HashtableInternalsDemo {

	public static void main(String[] args) {
		Hashtable table=new Hashtable();
		table.put(new Keys(8), "Amit Kumar");
		table.put(new Keys(1), "Sumit Kumar");
		table.put(new Keys(9), "Sunny Leone");
		table.put(new Keys(10), "Leah Gotti");
		table.put(new Keys(19), "Amanda cerny");
		table.put(new Keys(4), "Gaurav");
		table.put(new Keys(2), "Nikhil");
		table.put(new Keys(6), "Rishav");
		Set s=table.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
	}

}
