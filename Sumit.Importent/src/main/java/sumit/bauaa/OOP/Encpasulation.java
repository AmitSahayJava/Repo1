package sumit.bauaa.OOP;

public class Encpasulation {
	//DATA MEMBERS SHOULD NOT GO OUT DIRECTLY
	private int id;
	private String name;
	private String address;
	

	public Encpasulation(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
// or GETTER/SETTER


	public static void main(String[] args) {		
       System.out.println("THIS CLASS IS TIGHTLY ENCAPSULATED BECAUSE");
       System.out.println("ALL MEMBER VARIABLES ARE PRIVATE AND");
       System.out.println("CAN NOT BE DIRECTLY ACCESSED ");
       System.out.println("ONLY METHODS/CONSTRUCTOR CAN ACCESS IT");
	}

}
