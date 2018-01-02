package sumit.bauaa.ComparableComparator;

public class Person implements Comparable{
	private String name,mobile,address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName()+" , "+getMobile()+"  , "+getAddress();
	}
	
	
	//---------------COMPARABLE IMPLEMENTATION--------------------
	   /*COMPARISION BASED ON NAME*/
	public int compareTo(Object o){
		Person p=(Person)o;
		return this.getName().compareTo(p.getName());
	}
}
