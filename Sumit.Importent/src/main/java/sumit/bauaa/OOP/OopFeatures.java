package sumit.bauaa.OOP;

class Parent1{
	public void display(){
		System.out.println("I AM PARENT");
	}           //METHOD OVERLOADING
	public void display(String name){
		System.out.println("Your Name Is: "+name);
	}
}

class Child extends Parent1{
	//I AM GOING TO OVERRIDE display()
	public void display() {
		System.out.println("I AM CHILD");
	}
	
}

public class OopFeatures {

	public static void main(String[] args) {
		Parent1 parent=new Parent1();
		parent.display();
		parent.display("Amit Kumar");
		
		Parent1 parent1=new Child();
		parent1.display();

	}

}
