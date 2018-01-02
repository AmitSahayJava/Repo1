package sumit.bauaa.String;

public class StringToStringArray {

	public static void main(String[] args) {
		String line="MY   NAME IS AMIT AND I AM    GOOD BOY";
		String[] words=line.split("\\s+");
		System.out.println(words[0]+"  "+words[7]);

	}

}
