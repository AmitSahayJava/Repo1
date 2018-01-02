package sumit.bauaa.polimorphism;

class MethodCallsDemo{
	public void m1(int i){
		System.out.println("Integer");
	}
	public void m1(long l){
		System.out.println("Long");
	}
	public void m1(float f){
		System.out.println("Float");
	}
	public void m1(double d){
		System.out.println("Double");
	}
}

public class OverloadingMethodCalls {

	public static void main(String[] args) {
		MethodCallsDemo demo=new MethodCallsDemo();
		demo.m1(8.9);

	}

}
