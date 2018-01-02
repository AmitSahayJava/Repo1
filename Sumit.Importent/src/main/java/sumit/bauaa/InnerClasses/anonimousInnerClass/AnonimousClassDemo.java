package sumit.bauaa.InnerClasses.anonimousInnerClass;

class Parent{
	public void display(){
		System.out.println("I can ride Bike");
	}
}
/*class Child extends Parent{
	public void display(){
		System.out.println("I can ride Bike + Drive Car");
	}
}*/



public class AnonimousClassDemo {

	public static void main(String[] args) {
		Parent p=new Parent(){
			public void display(){
				System.out.println("I can ride Bike + Drive Car+ I use Anonimous inner class" );
			}
		};
		p.display();
	}
}
