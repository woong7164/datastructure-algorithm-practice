package main;

import java.util.Arrays;
import java.util.Scanner;
public class MakeMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int len = sc.nextInt();
		int[] A = new int[len];
		int[] B = new int[len];
		for(int i=0;i<A.length;i++){
			n = sc.nextInt();
			A[i] = n;
		}
		for(int i=0;i<B.length;i++){
			n = sc.nextInt();
			B[i] = n;
		}
		int answer = solution(A,B);
		System.out.print(answer);
		sc.close();
	}
	
    public static int solution(int[] A, int[] B) {
    	 int answer = 0;
         
         Arrays.sort(A);
         Arrays.sort(B);
         
         for(int i=0;i<A.length;i++){
             answer = answer + A[i]*B[(A.length-1)-i];
         }
         
         return answer;
    }
}
