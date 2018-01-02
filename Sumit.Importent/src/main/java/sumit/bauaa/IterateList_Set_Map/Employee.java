package sumit.bauaa.IterateList_Set_Map;

/*
 * USER DEFINED OBJECT
 * */
public class Employee {
  private int id;
  private String name;
  private double salary;
  private String jobDiscription;
  
  
  
public Employee(int id, String name, double salary, String jobDiscription) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.jobDiscription = jobDiscription;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getJobDiscription() {
	return jobDiscription;
}
public void setJobDiscription(String jobDiscription) {
	this.jobDiscription = jobDiscription;
}
@Override
public String toString() {
	return "[id=" + id + ", name=" + name + ", salary=" + salary + ", jobDiscription=" + jobDiscription + "]";
}


  
  
}
