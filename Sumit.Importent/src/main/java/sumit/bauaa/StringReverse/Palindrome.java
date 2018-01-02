package sumit.bauaa.StringReverse;

import java.util.Scanner;
/*
 * ULTA  SIDHA  AEK  SAMAAN
 * */
public class Palindrome {

	public static void main(String[] args) {
		
		String line2="";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your String");
		String line1=scanner.nextLine();
		int length=line1.length();
		for(int i=length-1;i>=0;i--){
			line2=line2+line1.charAt(i);
		}
		System.out.println(line2);
		if(line1.equals(line2)){
			System.out.println("Palindrome String: "+true);
		}else{
			System.out.println("Palindrome String: "+false);
		}

	}

}
