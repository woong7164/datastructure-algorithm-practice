package main;

import java.util.Scanner;
//백준 https://www.acmicpc.net/problem/5543
public class LowestPriceSetMenuMin {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int bur = Integer.MAX_VALUE;
		int dri = Integer.MAX_VALUE;
		
		for(int i=0; i<3; i++) {
			bur = Math.min(bur, sc.nextInt());
		}
		
		for(int i=0; i<2; i++) {
			dri = Math.min(dri, sc.nextInt());
		}		
		
		sc.close();
	    System.out.println((bur+dri)-50);

	}
}