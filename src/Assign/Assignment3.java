package Assign;

public class Assignment3 {

	public static void main(String[] args) {
		int arr[]= {12,45,67,23,54};
		
		        for (int i=0;i<arr.length;i++) {
				       int m = i;
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[j] > arr[m]) {
		                    m = j;}}
		            int n = arr[i];
		            arr[i] = arr[m];
		            arr[m] = n;
		        }

		      for(int i=0;i<arr.length;i++) {
		    	  System.out.print(arr[i]+" ");  	  
		      }
		      System.out.println("\nSecond Max Number: "+arr[1]);
		    }}