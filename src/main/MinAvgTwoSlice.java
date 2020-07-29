package main;
import java.util.*;
//https://app.codility.com/demo/results/trainingMAT56Q-27Y/
//평균은 최소 2가지의 숫자와 3가지의 숫자 이외에는 확률적으로 해당 평균보다 적게나오기가 힘듬
//그래서 맨 처음에 2가지의 숫자의 평균을 각각 구해서 최소 평균과 최소 인덱스값을 저장해놓고
//다음으로 3가의 숫자 평균을 구한다음에 위에서 구했던 최소 평균과 최소 인덱스를 또 비교
//단, 평균값이기 때문에 항상 Double 로 진행해야 하는것은 Point!

public class MinAvgTwoSlice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N; i++){
			arr[i]= sc.nextInt();
		}
		int a = solution(arr);
		System.out.println("a"+ a);
		sc.close();
	}
	
	public static int solution(int[] A) {
		double minValue = Double.MAX_VALUE;
        int minIndex = 0;
        
        for(int i = 1;i<A.length;i++){
            double avg = (A[i-1]+A[i])/2.0;
            if(minValue>avg){
                minValue = avg;
                minIndex = i-1;
                //System.out.println("--- "+ minIndex);
            }
        }
        
        for(int i = 2;i<A.length;i++){
            double avg = (A[i-2]+A[i-1]+A[i])/3.0;
            if(minValue>avg){
                minValue = avg;
                minIndex = i-2;
                //System.out.println("---1 "+ minIndex);                
            }
        }
        
        return minIndex;
	}
}