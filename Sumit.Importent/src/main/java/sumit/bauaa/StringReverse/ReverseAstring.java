package sumit.bauaa.StringReverse;

import java.util.Scanner;

public class ReverseAstring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String to REVERSE");
		String line=scanner.nextLine(); 
		int size=line.length();
		StringBuffer reverseLine=new StringBuffer();
		/*REVERSE PROCESS STARTED*/
		for(int i=size-1;i>=0;i--){
			reverseLine=reverseLine.append(line.charAt(i));
		}
		System.out.println(reverseLine);
	}

}
