package sumit.factory;

public class Main {

	public static void main(String[] args) throws Exception {
		// If main method wants to use A, B or C then he must not need to create it's instance
		//using new, just use factory method and get it's instance
		//LOOSE COUPLING
		
		
	  
	  B b=(B)Factory.getInstance("B");
	  b.pilot("Pune");

	}

}
