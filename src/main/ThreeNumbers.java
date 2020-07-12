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
	    sc.close();
	}
}


