package main;

import java.util.Arrays;
import java.util.Scanner;
// 백준 https://www.acmicpc.net/problem/5543
public class LowestPriceSetMenuSort {
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

