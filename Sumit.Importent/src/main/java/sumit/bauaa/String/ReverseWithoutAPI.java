package sumit.bauaa.String;

public class ReverseWithoutAPI {

	public static void main(String[] args) {
		String line="A B C D E";
		StringBuffer reverse=new StringBuffer();
		
		for(int i=line.length()-1;i>=0;i--){
			reverse=reverse.append(line.charAt(i));
		}
		System.out.println(reverse);

	}

}
