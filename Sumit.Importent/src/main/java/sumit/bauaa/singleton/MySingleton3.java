package sumit.bauaa.singleton;

import java.util.Date;

public class MySingleton3 {
   /*
    * A class which can have only one instance
    * This class will have a method(ACCESSED FROM OUTSIDE, WITHOUT OBJECT) to return it's object
    * 
    */
	private static MySingleton3 instance=new MySingleton3();
	
	private MySingleton3(){}
	
	public static MySingleton3 getInstance(){
		return instance;
	}
	
	//SOME TASK WHICH CAN BE PERFORMED WITH THIS INSTANCE
	public void displayGreetingMSG(){
		System.out.println("Welcome Sir, Todays date is: "+new Date());
	}
}
