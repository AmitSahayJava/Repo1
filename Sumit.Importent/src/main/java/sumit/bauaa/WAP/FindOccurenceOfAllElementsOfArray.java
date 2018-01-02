package sumit.bauaa.WAP;

public class FindOccurenceOfAllElementsOfArray {

	public static void main(String[] args) {
		char[] c={'a','a','b','c','d','d','d','e','e'};
		for(int i=0;i<c.length;i++){
			int count=0;
			char ch=c[i];
			for(int j=0;j<c.length;j++){
			  if(ch==c[j]){
				  count++;
			  }
			  
			}
			System.out.println(c[i]+" Has occured "+count+" Times");
		}

	}

}
