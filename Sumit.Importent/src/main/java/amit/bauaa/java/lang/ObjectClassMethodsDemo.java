package amit.bauaa.java.lang;

import java.util.WeakHashMap;

class Employee{
	private int id;
	private String name;
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	//////////////////////////////////////////
	@Override
	public String toString() { //toString() is used to represent Object as String
		return id+" "+name;
	}
	//////////////////////////////////////////
	@Override
	public int hashCode() {
		return id; //now hash code of Employee Object is it's id
	}
	/////////////////////////////////////////
	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		if(this.id==e.id){
		     return true;
		}else
			return false;
	}
	/////////////////////////////////////////
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return this;
	}
	////////////////////////////////////////
	@Override
	protected void finalize() throws Throwable {
		System.out.println("when i will have no reference then GC will call this method before destrowing me");
		super.finalize();
	}
}

public class ObjectClassMethodsDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1=new Employee(10, "Sahay");
		Employee e2=new Employee(10, "Sumit");
		Employee e3=new Employee(11, "Amit");
		System.out.println(e1);            //10 Sahay
		System.out.println(e1.hashCode()); //10
		System.out.println(e1.equals(e2)); //true
		System.out.println(e1.equals(e3)); //false
		Employee e4=(Employee)e3.clone();  
		System.out.println(e3.equals(e4)); //true
		System.out.println(e2.getClass()); //class amit.bauaa.java.lang.Employee
		WeakHashMap whm=new WeakHashMap<Employee, String>();
		Employee e5=new Employee(15, "Obama");
		whm.put(e1, "Apple");
		whm.put(e2, "Ball");
		whm.put(e3, "Cat");
		whm.put(e4, "Dag");
		whm.put(e5, "Former");
		e5=null;
		System.gc();
		   
		System.out.println(whm);/*when i will have no reference then GC will call this method before destrowing me
                                     {11 Amit=Dag, 10 Sahay=Ball}  */

	}
}
