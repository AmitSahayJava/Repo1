package sumit.bauaa.WAP;

import java.util.Scanner;

public class ProgramToCheckOccurenceOfParticularCharacter {

	public static void main(String[] args) {
		int[] a={10,20,10,30,50,50,60}; 
        System.out.println("Enter digit to find it's occurence in a");
        Scanner sc=new Scanner(System.in);
        int userGiven=sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
        	if(userGiven==a[i]){
        		count++;
        	}
        }
        System.out.println("Your number: "+userGiven+" Has occured: "+count+" Times");
	}

}
