package sumit.bauaa.exceptions;
/*
 * if Static variable is not initialize with proper value
 */

public  class ExceptionInInitializerErrorDemo {
	static int i = 10 / 0;

	/*
	 * static{ System.out.println(i);//ExceptionInInitializerError //Caused by:
	 * java.lang.ArithmeticException: / by zero }
	 */

	static {
		String s = null;
		System.out.println(s.length());//ExceptionInInitializerError //Caused by:
		 //java.lang.NullPointerException 
	}

	public static void main(String[] args) {
        
	}

}
