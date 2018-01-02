package sumit.bauaa.InnerClasses.memberClasses;

public class Demo2 {
	private String s;
	class Fruits{
		public void setS(String ss){
			s=ss;
		}
		public void createrName(){
			System.out.println("Amit Kumar");
		}
		class Apple{
			public void displayAll(){
				System.out.println("Value of s is: "+s);
				createrName();
			}
		}
	}
	public static void main(String[] args) {
	    Demo2 demo2=new Demo2();
	    /*How to access Fruits-->Apple--> displayAll() ? */
	    Demo2.Fruits fruits=demo2.new Fruits();
	    fruits.setS("Apple and Banana is good for me");
	    Demo2.Fruits.Apple apple=fruits.new Apple();
	    apple.displayAll();
	}
}
