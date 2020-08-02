//https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
//https://app.codility.com/demo/results/trainingTXMMK9-682/
package main.Codility_4_CountingElements;
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class FrogRiverOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N; i++){
			arr[i]= sc.nextInt();
		}
		int a = solution(X,arr);
		System.out.println("a"+ a);
		sc.close();
	}
	
    public static int solution(int X, int[] A) {
        HashSet<Integer> intSet = new HashSet<>();
        int index = -1;
	     for (int i=0;i<A.length;i++) {
	        intSet.add(A[i]);
	        // System.out.println("this is a debug message "+ intSet.toString());
	        if(intSet.size()==X){
	            index = i;
	            break;
	        }
	    }
	   // System.out.println("this is a debug message "+ intSet.toString());
	    
        
        return index;
    }
}
