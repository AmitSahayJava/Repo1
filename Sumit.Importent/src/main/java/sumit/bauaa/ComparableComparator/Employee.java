package sumit.bauaa.ComparableComparator;
/*
 * Insert Employee Object into TreeSet where all Objects will be sorted by id(Descending order)
 * */
class Employee implements Comparable {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		// to display Employee objects
		return "id=" + id + ", name=" + name;
	}

	public int compareTo(Object ob) {
		int id1 = this.id;
		Employee e = (Employee) ob;
		int id2 = e.id;
		if (id1 < id2) {
			return +1; // -1(Before) 0(Duplicate) +1(After)
		}else if(id1>id2){
			return -1;
		}
		else 
			return 0;  
				
	}
}
