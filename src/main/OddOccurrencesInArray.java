package main;
import java.util.*;
//https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
public class OddOccurrencesInArray {
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
	    
	     for (int arrayData : A) {
	        if(intSet.contains(arrayData)){
	            intSet.remove(arrayData);
	            continue;
	        }
	        
	        intSet.add(arrayData);
	    }
	    
	    int res = intSet.toArray(new Integer[intSet.size()])[0];
	    
	    return res;
	}
}