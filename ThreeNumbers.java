package main;

import java.util.Scanner;

public class ThreeNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
	    if (a > b)
	    {
	        if (a < c)  System.out.println(a);
	        if (b > c)  System.out.println(b);
	         System.out.println(c);
	    }
	    else
	    {
	        if (b < c)  System.out.println(b);
	        if (a > c)  System.out.println(a);
	         System.out.println(c);
	    } 
	    
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


