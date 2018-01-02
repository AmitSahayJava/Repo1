package sumit.bauaa.OOP;
class ParentObject{
	public void address(int a){
		System.out.println("Patna");
	}
	public String address(String a){
		return a;
	}
	public void address(){
		System.out.println("HAhahaha");
	}
	public void printName(){
		System.out.println("Anand Sundar Sahay");
	}
}

class ChildObject extends ParentObject{
	public void printName(){
		System.out.println("Amit Kumar , SumitKumar");
	}
	public void address(String a,int b){
		System.out.println("Patna");
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		ParentObject ref=new ChildObject();
		System.out.println(ref.address("USA ally"));

	}

}
