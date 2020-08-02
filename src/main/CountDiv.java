package main.Codility_5_PrefixSum;
import java.util.*;
//https://app.codility.com/demo/results/training6Q843X-U3S/
//하나하나 mod 해봐서 찾으면 시간복잡도에서 FAIL
//mod 안쓰는방법으로 풀어야함

public class CountDiv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		int a = solution(A,B,K);
		System.out.println("a"+ a);
		sc.close();
	}
	
    public static int solution(int A, int B, int K) {
    	
    	//A가 0부터 시작하면 B에서 K를 나눈수(B까지의 K의 배수갯수) 에 0을 뭐로 mod해도 0이기떄문에 무조건 +1
        if(A==0){
            return B/K+1;
        //1부터 시작이니까 B에서 K를 나눈수(B까지의 K의 배수갯수)에서 A전에나오는 K의 배수 갯수를 뺌
        }else{
            return B/K - (A-1)/K;
        }
    }
	
}