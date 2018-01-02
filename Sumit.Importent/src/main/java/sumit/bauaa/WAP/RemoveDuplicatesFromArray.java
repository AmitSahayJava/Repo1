package sumit.bauaa.WAP;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] array={5,5,8,7,0,0,9,8,8,4};
		Set set=new HashSet();
		for (int a : array) {
			set.add(a);
		}
		System.out.println(set);
		
		
		Set s1=new HashSet();
		String s="amit Kumar";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			s1.add(ch[i]);
		}
		System.out.println(s1);
	}

}
