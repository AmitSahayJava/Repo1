package sumit.bauaa.Array;
import java.util.Scanner;

public class MaxVal_FromUserProvidedArray {
	//public or private These must be defined outside any methods on class(Global level)
	private int size,max;
	private Scanner sc=new Scanner(System.in);
	
	public int maxVal(){		
		System.out.println("Enter array size, to create array at runtime");
		size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter array elements");
		for(int x=0;x<size;x++){
			a[x]=sc.nextInt();
		}
		//-----Our Array is created at runtime with elements
		max=a[0];
		for(int i=0;i<size;i++){
			if(max<a[i]){
				max=a[i];
			}
		}		
		return max;
	}
	public static void main(String[] args) {		
		MaxVal_FromUserProvidedArray o=new MaxVal_FromUserProvidedArray();
		int biggest=o.maxVal();
		System.out.println("Biggest element is: "+biggest);

	}
}
