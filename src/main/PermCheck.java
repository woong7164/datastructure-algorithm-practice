//https://app.codility.com/demo/results/trainingRN2BBD-62C/ 100%
//https://app.codility.com/demo/results/trainingTD83S7-8UA/ 25%

package main;
import java.util.*;

public class PermCheck {
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
        HashSet<Integer> intSet = new HashSet<>();
        
        for(int num: A){
             if(intSet.contains(num)){
                return 0;
            }
            intSet.add(num);
        }
        //1,2,3,4
        for(int i =0 ;i<intSet.size();i++){
          //  System.out.println("intSet1" + i);
            if(!intSet.contains(i+1)){
               // System.out.println("intSet" + i);
                return 0;
            }
        }
        
        //System.out.println("intSet3");

        return 1;
    }
    
    //https://app.codility.com/demo/results/trainingMZDVRM-C8U/?showingAll=1
    public int solution2(int[] A) {
        int result = 1;
        boolean[] check = new boolean[A.length + 1];

        for (int i : A) {
            if(i < check.length) {
                check[i] = true;
            }
        }

        for (int i=1; i<check.length; i++) {
            if (!check[i]) {
                result = 0;
            }
        }

        return result;
    }
}