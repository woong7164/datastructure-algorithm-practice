package main;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumbersSort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		//bubble sort
//	    for(int i=0;i<num.length - 1;i++){
//	    	for(int j = 1;j<num.length-i;j++){
//		    	if(num[j-1] > num[j]){
//		    		int temp = num[j];
//		    		num[j] = num[j-1];
//		    		num[j-1] = temp ;
//		    	}
//	    	}
//
//		   
//	    }
	    
	    Arrays.sort(num);
    
	    System.out.println(num[1]);
	}
}

//	  public static void insortionSort(int a[]) {
//	        int size = a.length;        
//	        for(int i=1; i<size; i++) {
//	            int temp = a[i];
//	            int j = i;
//	            while((j>0) && (a[j-1]>temp)) {
//	                a[j] = a[j-1];
//	                j--;
//	            }
//	            
//	            a[j] = temp;
//	            System.out.printf("\n삽입정렬 %d 단계 : ",i);
//	            for(int v : a) {
//	                System.out.printf("%3d ", v);
//	            }            
//	        }
//	        System.out.println();
//	    }



//
//30 50 20 10 50
//30 20 50 10 50
//30 20 10 50 50
//30 20 10 50 50
//
//20 30 10 50 50 
//20 10 30 50 50
//20 10 30 50 50
//
//10 20 30 50 50
//10 20 30 50 50
//
//10 20 30 50 50
//
//


