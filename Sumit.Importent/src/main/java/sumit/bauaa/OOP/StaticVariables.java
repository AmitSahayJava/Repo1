package sumit.bauaa.OOP;

public class StaticVariables {
	static String name;
	static{
		name="Sahay";
	}
	
	public static void main(String[] args) {
		StaticVariables instance=new StaticVariables();
		
		System.out.println(instance.name);
		
		System.out.println(StaticVariables.name);

	}

}
