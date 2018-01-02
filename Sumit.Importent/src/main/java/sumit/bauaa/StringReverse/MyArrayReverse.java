package sumit.bauaa.StringReverse;

import java.util.ArrayList;
import java.util.List;

public class MyArrayReverse {

	public static void main(String[] args) {
		int[] a={3,5,8,2,0}; 
		List l=new ArrayList<Integer>();
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+"  ");
			/*
			 * or store into some variable
			 */
			
			l.add(a[i]);
		}
		
		//PRINT l 
		System.out.println(l);
	}

}
