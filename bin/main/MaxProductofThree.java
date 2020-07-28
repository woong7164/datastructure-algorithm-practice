package main;
import java.util.*;
//https://app.codility.com/demo/results/training4YYGQ9-KWG/?showingAll=1
//https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
public class MaxProductofThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N; i++){
			arr[i]= sc.nextInt();
		}
		int a = solution(arr);
		System.out.println("a------"+ a);
		sc.close();
	}
	
	public static int solution(int[] A) {
        
        int len = A.length;
        int a= A[len-3]*A[len-2]*A[len-1];
        //System.out.println("this is a debug message "+a);
        int b=A[0]*A[1]*A[len-1];
        //System.out.println("this is a debug message "+b);
        
        int result = Math.max(a,b);
        
        return result;
    }
}