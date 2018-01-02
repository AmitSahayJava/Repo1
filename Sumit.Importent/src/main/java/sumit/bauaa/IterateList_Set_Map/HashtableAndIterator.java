package sumit.bauaa.IterateList_Set_Map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class KeyCreater{
	private int id;
	
	public KeyCreater(int id){
		this.id=id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		KeyCreater ob=(KeyCreater)obj;
		if(this.id==ob.id){
			return true;
		}else
			return false;
	}
	
	@Override
	public String toString() {
		return this.id+" ";
	}
	
}

public class HashtableAndIterator {

	public static void main(String[] args) {
		Map ref=new Hashtable(15);
		ref.put(new KeyCreater(10), "Sumit Kumar");
		ref.put(new KeyCreater(11), "Amit Kumar");
		ref.put(new KeyCreater(12), "Sunny Leone");
		ref.put(new KeyCreater(16), "Sania mirza");
		ref.put(new KeyCreater(25), "Amanda Cerny");
		List list=new ArrayList(ref.entrySet());
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
