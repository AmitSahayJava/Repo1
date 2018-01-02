package sumit.bauaa.OOP;

class StaticDemo{
	public static void display(String name){
		System.out.println("Your name is: "+name);
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		//Accessing display method through instance
		StaticDemo instance1=new StaticDemo();
		instance1.display("Amit kumar");
		StaticDemo instance2=new StaticDemo();
		instance2.display("Virat Kohli");
		
		//Accessing without instance
		StaticDemo.display("Sumit Kumar");
         
	}

}
