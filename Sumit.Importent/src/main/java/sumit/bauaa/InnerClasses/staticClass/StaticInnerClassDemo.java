package sumit.bauaa.InnerClasses.staticClass;

import sumit.bauaa.InnerClasses.staticClass.StaticInnerClassDemo.Fruit;

public class StaticInnerClassDemo {
	class Fruit{
		public void m1(){
			System.out.println("I am Apple");
		}
	}
	static class Animal{
		public void m1(){
			System.out.println("I am a super human and the entire universe is in me");
		}
	}
	private static class Car{
		public void m2(){
			System.out.println("I am a Lamborgini Super car, accessible by Amit only");
		}		
	}
	public static class House{
		public void m3(){
			System.out.println("I am White House, can be accessible from anywhere");
		}
	}
	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.m1();
	}
}
 class TryToAccess{
	 StaticInnerClassDemo obj=new StaticInnerClassDemo();
	 StaticInnerClassDemo.Fruit f=obj.new Fruit(); 
	 
	 
 }
