package main.Codility_10_PrimeAndCompositeNumers;
import java.util.*;

//https://app.codility.com/demo/results/trainingEKB892-EDU/
//약수를 일반적인 O(N)의 방식대로 풀면 시간초과가 나므로
//O(sqrt(N))정도로 줄여야한다

public class MinPerimeterRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = solution(n);
		System.out.println("a------"+ a);
		sc.close();
	}
	
    public static int solution(int N) {
        int sqrt = (int)Math.sqrt(N);
        int min = Integer.MAX_VALUE;
        int A = 0;
        int B = 0;
        int perimeter = 0;
        for(int i =1; i<= sqrt; i++){
            if(N%i==0){
                A = i; //약수
                B = N/A; // 짝꿍 약수는 A값을 약수로 나눈 값
                perimeter = 2*(A+B);
                
                min = Math.min(min,perimeter);
            }
        }
        
        return min;
     }
}