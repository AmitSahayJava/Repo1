package sumit.bauaa.exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;
class Employee{
	private String name;
	public Employee(String name){
		this.name=name;
	}
	public void finalize(){
		System.out.println("I am dying");
	}
}
public class TryCatchDemo {
	public static void main(String[] args) {
		Employee e=new Employee("Kane");
		e=null;
		System.gc();
	}
}
