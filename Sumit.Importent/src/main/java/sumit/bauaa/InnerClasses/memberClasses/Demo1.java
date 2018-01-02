package sumit.bauaa.InnerClasses.memberClasses;

import sumit.bauaa.InnerClasses.memberClasses.A.B;

class A{
	int i;
	class B{
		int j;
		public void display(){
			System.out.println("kkkkkk");
			System.out.println("i= : "+i+" j= : "+j);
		}
	}
}
public class Demo1 {
	public static void main(String[] args) {
		A a=new A();
		a.i=10;
		A.B b=a.new B();
		b.j=20;
		b.display();
	}
}
