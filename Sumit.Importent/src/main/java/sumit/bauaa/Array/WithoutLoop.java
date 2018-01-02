package sumit.bauaa.Array;

public class WithoutLoop {
	public static void main(String[] args) {
		//Main method must be able to call that method without object
		recursive(1);
	}	
	private static void recursive(int i){
		if(i<=10){
			System.out.println(i);
			i++;
			recursive(i);
		}
	}

}
