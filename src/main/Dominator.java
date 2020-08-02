package main.Codility_8_Leader;
import java.util.*;
//https://app.codility.com/demo/results/training5Z6PWF-AX7/
//HashMap 을 사용해서 품
//배열의 길이의 반의 값보다 많은 요소의 위치 찾기
public class Dominator {
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
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer index = -1;
        if(A.length==1){
            return 0;
        }
         //System.out.println("this is a debug message"+ A.length);
        for(int i=0;i<A.length;i++){
            if(map.get(A[i])==null){
                map.put(A[i],1);
            }else{
                Integer count = map.get(A[i]) +1;
                map.put(A[i],count);
                if(count>A.length/2){
                    return i;
                }
            }
        }
       
        return index;
     }
}