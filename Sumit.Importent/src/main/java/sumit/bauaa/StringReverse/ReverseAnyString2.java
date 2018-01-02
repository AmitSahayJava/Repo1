package sumit.bauaa.StringReverse;

import java.util.Scanner;

public class ReverseAnyString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
       System.out.println("ENTER YOUR STRING INTO THE REVERSE MACHINE");
       String userString=scanner.nextLine();
       String reverseString="";
       /*
        * TO REVERSE THE STRING WE MUST KNOW SIZE OF THE STRING
        * SO WE CAN SET LAST index as first index
        */
       int size=userString.length();
       /*Last indexes of user String is size-1*/
       for(int i=size-1;i>=0;i--){
    	   reverseString=reverseString+userString.charAt(i);
       }
       System.out.println("The reverse of your String is: "+reverseString);
	}

}
