package sumit.bauaa.Array;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		int[] arr={10,6,9,61,8,4,57};
		int size=arr.length;
        //Sort
		int temp;
        for(int i=0;i<size;i++){
        	for(int j= i+1;j<size;j++){
        		  if(arr[i]>arr[j]){
        			  temp=arr[i];
        			  arr[i]=arr[j];
        			  arr[j]=arr[temp];
        		  }
        	}
        }
        //After sorting
        System.out.print("Ascending Order:");
        for (int i = 0; i < size - 1; i++) 
        {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[size - 1]);       
        
	}

}
