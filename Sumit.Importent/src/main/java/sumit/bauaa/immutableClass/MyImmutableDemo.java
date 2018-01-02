package sumit.bauaa.immutableClass;

final class Immutable{
	final int id;
	public Immutable(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public Immutable modify(int newId){
		if(this.id==newId){
			return this;
		}else
			return new Immutable(newId);
	}
}

public class MyImmutableDemo {
    public static void main(String[] args) {
    	Immutable obj1=new Immutable(10);
    	Immutable obj2=obj1.modify(10);
    	System.out.println(obj1==obj2);
    	Immutable obj3=obj1.modify(12);
    	System.out.println(obj1==obj3);
	}   
    
}
