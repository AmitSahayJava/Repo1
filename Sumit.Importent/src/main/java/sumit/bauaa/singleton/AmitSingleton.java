package sumit.bauaa.singleton;

public class AmitSingleton {
    //THIS CLASS WILL HAVE ONLY ONE OBJECT.
	//NO ONE IS ALLOWED TO CREATE IT'S OBJECT FROM OUTSIDE(PRIVATE CONSTRUCTOR)
	//A STATIC METHOD WILL RETURN IT'S OBJECT
	
	private static AmitSingleton instance=new AmitSingleton();
	
	private AmitSingleton(){}
	
	public static AmitSingleton getInstance(){
		return instance;
	}
}
