package sumit.bauaa.InnerClasses.anonimousInnerClass;

interface Phone{
	void display();
}

public class AnonimousDemo2 {

	public static void main(String[] args) {
		Phone p=new Phone() {			
			public void display() {
				System.out.println("I can call");				
			}
		}; 
		p.display();
	}
}
