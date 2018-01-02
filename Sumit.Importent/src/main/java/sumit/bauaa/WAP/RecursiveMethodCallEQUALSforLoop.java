package sumit.bauaa.WAP;

public class RecursiveMethodCallEQUALSforLoop {

	public static void main(String[] args) {
		printNumbersWithoutLoop(1);
		
		String s=new String("Durga");
	}
	
	public static void printNumbersWithoutLoop(int num){
		if(num<=10){
			System.out.println(num);
			printNumbersWithoutLoop(num+1);//Recursive Method Call
		}
	}

}
