package sumit.bauaa.StringReverse;

import java.util.Scanner;

public class ReverseUserString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input a String in Reverse Machine");
		String userGiven=scanner.nextLine();
		StringBuffer reverse=new StringBuffer();
		
		for(int i=userGiven.length()-1;i>=0;i--){
			reverse=reverse.append(userGiven.charAt(i));
		}
		
		System.out.println(reverse);
	}

}
