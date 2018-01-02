package sumit.bauaa.WAP;

public class CountNumberOfVowel {

	public static void main(String[] args) {
		String name="amit kumar";
		int count=0;
		
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
			switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		System.out.println("Total vowel in your name is: "+count);

	}

}
