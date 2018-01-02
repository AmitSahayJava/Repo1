package sumit.bauaa.ComparableComparator;

public class StudentBean{
	private int id;
	private String sname;
	public StudentBean(int id,String sname) {
		this.id=id;
		this.sname=sname;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		
		return id+"  "+sname;
	}
	
}

