package sumit.bauaa.Array;
import java.util.HashMap;
import java.util.Map;

public class Find_number_of_time_elements_has_occured_in_Array {
	public static void main(String[] args) {
		String line="aabcccdd";
		char[] a=line.toCharArray();
		Map map=new HashMap();
		
		for(int i=0;i<a.length;i++){
			int count=0;
			char c=a[i]; //get ith element and compare it with each and every one
			for(int j=0;j<a.length;j++){
				if(c==a[j]){
					count++;
				}
			}
			map.put(a[i], count);			
		}
		System.out.println(map);
	}
}
