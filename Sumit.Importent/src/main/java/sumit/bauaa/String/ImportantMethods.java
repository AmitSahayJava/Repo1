package sumit.bauaa.String;

public class ImportantMethods {

	public static void main(String[] args) {
		String s1=new String("Durga");
		String s2=s1.intern();
		System.out.println(s1==s2);//False
		String s3="Durga";
		System.out.println(s2==s3);//True
		 
		String line="Sumit   9570943875   Patna   1500000";
		
		String[] words=line.split("\\s+"); 
		//words[0]="Sumit", words[1]="9570943875", words[2]="Patna", words[3]="1500000"
		
		System.out.println(words[2]); //Patna
		//String words[1]="9570943875";
		System.out.println(words[1].substring(0, 2)); //95
		System.out.println(words[1].substring(0, 2).equals("95"));//true
       
		// substring(0,2) means cut 0 and 1 and keep 2 onwards
	} 
	

}
