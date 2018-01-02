package sumit.bauaa.StringReverse;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println("Enter integer to print it's reverse");
		Scanner sc=new Scanner(System.in);
		int original=sc.nextInt();
		ReverseInteger object=new ReverseInteger();
		System.out.println("Reverse is: "+object.reverseLogic(original) );
	}
	
	public int reverseLogic(int i){
		int temp=i;
		int last_Digit=0;
		while(temp!=0){
			last_Digit=last_Digit*10+temp%10;
			temp=temp/10;
		}
		return last_Digit;
	}

}
