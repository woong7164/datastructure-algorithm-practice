package main;
import java.util.*;
//https://app.codility.com/demo/results/training4MP7HQ-HRK/?showingAll=1
//수식을 사용해서 시간복잡도 줄이
//여기서 서로 교차하는 차의 수는 0 이후에 1이 나올 경우 혹은 1 왼쪽의 0의 갯수를 모두 세는 알고리즘을 짜야한다. 
//문제를 O(N)으로 풀기 위해서 0의 갯수를 세는 zeroCnt 가 있고 1이 나올때마다 1의 왼쪽에 있는 0 의 총갯수를 zeroCntSum 해주었다.
//즉, 0 이후의 1 갯수를 셀때는 O(N^2) 인 반면 1 이전의 0 갯수를 세면 O(N)으로 짤 수 있다.

public class PassingCars {
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
	
	//0 이후의 1 갯수를 셀때
	//Detected time complexity:O(N ** 2)
	public static int solution(int[] A) {
       int count = 0;
        
        if(A.length==1){
            return 0;
        }
        
        for(int i=0;i<A.length;i++){
            if(A[i] == 0){
                for(int j=i+1; j<A.length;j++){
                    if(A[j]==1){
                        count++;
                    }
                }
            }
        }
        
        if(count>1000000000){
            count = -1;
        }
        
        return count;
	}
	
	//1 이전의 0 갯수를 세면
	//O(N)
	public static int solution2(int[] A) {
        int zeroCnt = 0;
        int zeroCntSum = 0;

        for (int i : A) {
        	//0의 갯수 세기
            if (i == 0) zeroCnt++;
            
            //1의 왼쪽의 모든 0세기
            else zeroCntSum += zeroCnt;
        }

        if (zeroCntSum > 1000000000) return -1;

        return zeroCntSum;
	}
	
	//A 배열의 합은 1의 갯수가 될 테고, 서쪽으로 가는 차의 대수가 나올거다. 아마도
	//그 합을 가지고 있다가 A 배열의 반복문을 돌면서 A배열에서 동쪽으로 가는 차가 나올 경우 
	//그 차보다 오른쪽에 있는 서쪽으로 가는 차의 대수를 모두 sum에 더한다.
	//그 과정에서 서쪽으로 가는 차가 나오는 경우 서쪽으로 가는 차의 대수를 하나씩 빼 줌.
    public int solution3(int[] A) {
        int sum = 0;
        int countOne = 0;
        for(int i=0; i<A.length; i++) {
            countOne+=A[i];
        }
        for(int i=0; i<A.length; i++) {
            if(A[i] == 0) {
                sum += countOne;
                if(1000000000 < sum) {
                    return -1;
                }
            } else {
                countOne--;
            }
        }
        return sum;
    }
}