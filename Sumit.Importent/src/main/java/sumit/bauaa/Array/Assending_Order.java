package sumit.bauaa.Array;

import java.util.Scanner;

public class Assending_Order {
	public static void main(String[] args) 
    {
        int n, temp;
        int[] a={2,8,5,1,9,7};
        for(int i=0;i<a.length;i++){
        	//Get ith element in each iteration and compare it with every other
        	for(int j=i+1;j<a.length;j++){
        		if(a[i]>a[j]){
        			temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;        			
        		}        		
        	}        	
        }        
        System.out.print("Ascending Order:");
        for (int i : a) {
			System.out.print(i);
		}        
        System.out.println("\n"+"Biggest value is: "+a[a.length-1]);
    }
}























