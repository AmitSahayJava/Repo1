package sumit.bauaa.StringReverse;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your String into Reverse Machine: ");
		String original = scanner.nextLine();
		int size = original.length(); // SO NOW WE CAN MAKE LAST INDEX ELEMENT
										// TO FIRST INDEX ELEMENT
        StringBuffer reverse=new StringBuffer();
        for(int i=size-1;i>=0;i--){
        	reverse.append(original.charAt(i));
        }
        System.out.println(reverse);
	}

}
