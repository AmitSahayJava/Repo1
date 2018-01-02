package sumit.bauaa.WAP;

import java.util.Arrays;

public class FindSecondLargestElementInAArray {

	public static void main(String[] args) {
		int[] Intarray={5,8,2,0,20,7,21};
		
		//FIRST SORT THE ELEMENTS OF AN ARRAY
		//Arrays class is having sort method
		Arrays.sort(Intarray);
		for (int i : Intarray) {
			System.out.println(i);
		}
		//Now print the Last-1 index value
		int lastButOneIndex=Intarray.length-2;//BCZ index starts from 0 and ends on n-1
		System.out.println("Second largest element is: "+Intarray[lastButOneIndex]);

	}

}
