package sumit.bauaa.String;

public class RemoveGivenCharacterFromString {
	String newString;
	public String manipulate(String str, Character ch){
		 newString=str.replaceAll(ch.toString(), "");
			return newString;
		
	}

	public static void main(String[] args) {
		RemoveGivenCharacterFromString o=new RemoveGivenCharacterFromString();
		o.manipulate("Undertaker", 'e');
        System.out.println(o.manipulate("Undertaker", 'e'));
	}

}
