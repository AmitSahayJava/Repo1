package sumit.bauaa.WAP;
/*
 * TO PRINT NUMBERS WE CAN USE RECURTION CONCEPT
 */
public class PrintNumbersWithoutUsingLoop {

	public static void main(String[] args) {
		
        printNumbers(1);
	}
	
	private static void printNumbers(int i){
		if(i<=10){ //IF IS NOT A LOOP, IT JUST CHECK CONDITION
			System.out.println(i);
			printNumbers(i+1);//Recursive method call,So it works like for loop
		}
	}

}
