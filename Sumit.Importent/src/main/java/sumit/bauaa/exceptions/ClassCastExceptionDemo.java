package sumit.bauaa.exceptions;

/*
 * PARENT REFERENCE CAN BE USED TO HOLD CHILD OBJECT, BUT CHILD REFERENCE CAN NOT HOLD PARENT
 * OBJECT. (Child to Parent conversion is possible, but Parent to Child Conversion is not possible)
 */

public class ClassCastExceptionDemo {

	public static void main(String[] args) {
		String s=new String("Durga");
		Object o=(Object)s;
		System.out.println(o);// O/p:Durga
		
		Object o1=new String("Amit");
		String s1=(String)o1;
		System.out.println("Here typecast is possible because Runtime Object is of String type");
		System.out.println(s1); //O/p:Amit
		
		Object o2=new Object();
		String s2=(String)o2;
		System.out.println(s2);//ClassCastException
	}

}
