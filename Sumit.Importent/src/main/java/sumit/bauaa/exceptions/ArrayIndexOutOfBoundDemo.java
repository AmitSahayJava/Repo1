package sumit.bauaa.exceptions;

/*
 * HERE a MEANS THE ENTIRE ARRAY OBJECT HENCE WE MIGHT GET OUTPUT OF S.O.P(a); LIKE [I@19e0bfd
 * */

public class ArrayIndexOutOfBoundDemo {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=6; a[1]=3; a[2]=12; a[3]=76; a[4]=0;

		System.out.println("First element is: "+a);
		System.out.println("forth element is: "+a[3]);
		System.out.println("9th element is: "+a[8]);
	}

}
