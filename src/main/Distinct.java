package main.Codility_6_Sorting;
import java.util.*;
//https://app.codility.com/demo/results/training2BHFDA-AWS/
public class Distinct {
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
        HashSet<Integer> intSet = new HashSet<>();
        for(int num: A){
            intSet.add(num);
        }
        
        return intSet.size();
    }
}