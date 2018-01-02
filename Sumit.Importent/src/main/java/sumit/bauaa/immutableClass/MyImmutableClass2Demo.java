package sumit.bauaa.immutableClass;

final class Immutable2{
	private final String property;
	public Immutable2(String s){
		this.property=s;
	}
	
	public Immutable2 getInstance(){
		return this;
	}
	
	public Immutable2 Modify(String s){
		if(this.property.equals(s)){
			return this;
		}else
			return new Immutable2(s);
	}
}

public class MyImmutableClass2Demo {

	public static void main(String[] args) {
           Immutable2 instance1=new Immutable2("Sumit Kumar");
           Immutable2 instance2= instance1.Modify("Sumit Kumar");
           Immutable2 instance3=instance1.Modify("Sahay");
           System.out.println(instance1==instance2);
           System.out.println(instance2==instance3);
 
	}

}
