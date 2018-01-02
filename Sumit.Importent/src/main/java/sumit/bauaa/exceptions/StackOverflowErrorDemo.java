package sumit.bauaa.exceptions;
/*
 * CYCLE METHOD CALL 
 */

public class StackOverflowErrorDemo {
	
	public void m1(){
		m2();
	}
	
	public void m2(){
		m1();
	}

	public static void main(String[] args) {
		StackOverflowErrorDemo ref=new StackOverflowErrorDemo();
		ref.m1(); //StackOverflowError

	}

}
