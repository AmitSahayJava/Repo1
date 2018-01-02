package sumit.bauaa.singleton;
import java.util.Date;
import java.util.Scanner;

public class MySingleton2 {
   //Constructor is used to initialize state of the instance, hence it should be private  	
   //Only one object will be returned 
   //And the method which returns that object should be accessed from outside without it's object
   //It's return type must be of class(MySingleton2) type
   //static method can access/return only static objects/instance 
   //And that instance should not be accessed directly from outside	
   	
	/*
	 * Code started 
	 */
	private static MySingleton2 instance=new MySingleton2();
	
	private MySingleton2(){}
	
	public static MySingleton2 getInstance(){
		return instance;
	}
	
	/*TASK WHICH CAN BE PERFORMED USING THAT INSTANCE(not mendatory)*/
	//ONLY PUBLIC METHOD IS ACCESSIBLE BY IT'S INSTANCE (FROM OUTSIDE)
	public void getUserDetails(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=scanner.nextLine();
		System.out.println("Your name is: "+name+"  Current Date: "+new Date());
	}
}
