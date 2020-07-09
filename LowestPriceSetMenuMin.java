package main;

import java.util.Arrays;
import java.util.Scanner;

public class LowestPriceSetMenuMin {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] h = new int[3];
		int[] d = new int[2];
		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}
		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}
		
		int[] sum = new int[3]; 
		for(int i=0;i<h.length;i++){
			for(int j = 0;j<d.length;j++){
		    	sum[i] = h[i]+d[j];
	    	}
	    }
		Arrays.sort(h);
		Arrays.sort(d);
		sc.close();
	    System.out.println((h[0]+d[0])-50);

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


