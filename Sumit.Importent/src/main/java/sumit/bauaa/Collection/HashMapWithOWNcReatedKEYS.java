package sumit.bauaa.Collection;

import java.util.HashMap;
import java.util.Map;

class Key{
	private int id;
	public Key(int id){
		this.id=id;
	}
	public int hashCode(){
		return id;
	}
	public boolean equals(Key e){
		if(this.id==e.id){
			return true;
		}else 
			return false;
	}
	@Override
	public String toString() {
		return id+" ";
	}
}

public class HashMapWithOWNcReatedKEYS {

	public static void main(String[] args) {
		Map mapReference=new HashMap(20);
		//insertion into HashMap
        mapReference.put(new Key(5), "Apple"); //second
        mapReference.put(new Key(9), "Ball"); //first
        mapReference.put(new Key(3), "Cat");  //four
        mapReference.put(new Key(1), "Dog");  //five 
        mapReference.put(new Key(15), "Dog"); //third
        mapReference.put(new Key(15), "Dinorore");
        mapReference.put(new Key(0), "Hero");
        mapReference.put(new Key(22), "Dinorore");
        System.out.println(mapReference);
	}

}
