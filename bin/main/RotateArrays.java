https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/

package main;
import java.util.*;

public class RotateArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N; i++){
			arr[i]= sc.nextInt();
		}
		int k = sc.nextInt();
		int[] a = solutionCorrect(arr,k);
		System.out.println("a"+ Arrays.toString(a));
		sc.close();
	}
	
	public static int[]  solutionCorrect(int[] A, int K) {

        int[] array = new int[A.length];

        for (int i=0; i<A.length; i++) {
            int tempIndex = (i+K) % A.length;
            array[tempIndex] = A[i];
        }

        return array;
    }
	
	public static int[] solution(int[] A, int K) {
	      if(K==0 || A.length == 0){
	         return A;
	     }
	     
	     if(K%A.length==0){
	         return A;
	     }
	     
	      K = (K-1) % (A.length-1);
	      if(K==0){
	         return A;
	     }
	      int[] B = Arrays.copyOfRange( A, K,A.length); 
	      int[] C = Arrays.copyOfRange( A, 0, K); 
	       System.out.println("this is a debug message "+Arrays.toString(B));
	       System.out.println("this is a debug message "+Arrays.toString(C));
	       
	      int fal = B.length;       
	      int sal = C.length;   
	      int[] result = new int[fal + sal]; 
	      System.arraycopy(B, 0, result, 0, fal);  
	      System.arraycopy(C, 0, result, fal, sal);  
	      System.out.println(Arrays.toString(result)); 
	      return result;
	 }
}