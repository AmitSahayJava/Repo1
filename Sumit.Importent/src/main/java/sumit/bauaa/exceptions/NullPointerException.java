package sumit.bauaa.exceptions;
/*
 * WHEN WE PERFORM ANY OPERATION ON NULL
 */
public class NullPointerException {

	public static void main(String[] args) {
		String name=null;
		int size=name.length();
		System.out.println("The size of name is: "+size);

	}

}
