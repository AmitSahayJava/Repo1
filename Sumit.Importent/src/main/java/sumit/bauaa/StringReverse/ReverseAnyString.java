package sumit.bauaa.StringReverse;

import java.util.Scanner;

public class ReverseAnyString {

	public static void main(String[] args) {
		/*FIRST TAKE STRING FROM USER*/
		System.out.println("ENTER A STRING TO REVERSE");
		Scanner scanner=new Scanner(System.in);
		String yourString=scanner.nextLine();
		
		int length=yourString.length();
		
		String reverse="";
		
		for(int i=length-1;i>=0;i--){
			reverse=reverse+yourString.charAt(i);
		}
		
		System.out.println(reverse);
		

	}

}
