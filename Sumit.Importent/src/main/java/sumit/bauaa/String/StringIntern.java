package sumit.bauaa.String;

public class StringIntern {

	public static void main(String[] args) {
		String s="Amit";
		String ss=new String("Amit");
		System.out.println(s==ss);//false
		
        System.out.println("After Intern");
        ss=ss.intern();
        System.out.println(s==ss);//true
	}

}
