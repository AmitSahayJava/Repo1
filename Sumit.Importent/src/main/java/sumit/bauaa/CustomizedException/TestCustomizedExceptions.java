package sumit.bauaa.CustomizedException;

import java.util.Scanner;

public class TestCustomizedExceptions {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Age To Check Voting Right");
		int age=scanner.nextInt();
//		if(value<18){
//			throw new MyException("Kid Grow Up");
//		}else{System.out.println("Fine");}
		
		if(age>60){
			throw new OldAgeException("BABA IS NOT ALLOWED");
		}else{
			System.out.println("chote baba are allowed");
		}
	}

}
