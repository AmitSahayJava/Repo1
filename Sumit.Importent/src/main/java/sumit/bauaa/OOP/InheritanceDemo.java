package sumit.bauaa.OOP;

class Parent{
	public void printName(){
		System.out.println("Anand Sundar Sahay");
	}
}

class Child1 extends Parent{
	public void printName(){
		System.out.println("Amit Kumar");
	}
}

class Child2 extends Parent{
	public void printName() {
		System.out.println("Sumit Kumar");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
	
             Parent pref=new Child1(); pref.printName();
             Parent pref2=new Child2(); pref2.printName();
	}

}
