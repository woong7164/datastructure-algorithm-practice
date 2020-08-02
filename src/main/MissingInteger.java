//https://app.codility.com/demo/results/trainingTXCQU2-JAJ/
// 배열에서 빠진 0보다큰 수 찾기 
package main;
import java.util.*;

//HashSet 을 이용
//1부터 Integer MAX 까지 비교하면서 빠진수 체크 
public class MissingInteger {
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
        Set<Integer> foundNums = new HashSet<>();
     
        for (int a : A) {
            foundNums.add(a);
        }
     
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (!foundNums.contains(i)) {
                System.out.println("i :" +i);
                return i;
            }
        }
     
        return -1;
    }
}