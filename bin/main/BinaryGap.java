//https://app.codility.com/programmers/lessons/1-iterations/binary_gap/

package main;
import java.util.*;

public class BinaryGap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int N = sc.nextInt();
		
		int a = solution(N);
		System.out.println("a"+ a);
		sc.close();
	}
	
	public static int solution(int N) {
		 Stack<Integer> s = new Stack<>();
		 List<Integer> list = new ArrayList<>();
		 int[] arr;
	     int MaxLength = 0;
	     int count=0;
	     if(N<2){
	    	 return 0;
	     }
	     
	     while(N>=2){
	    	 s.push(N%2);
	    	 System.out.println("s--"+ s.peek());
	          N = N/2;
	          if(N==1){
	        	  s.push(N);
	        	  System.out.println("s--"+ s.peek());
	              break;
	          }
	     }   // write your code in Java SE 8
	     
	     Iterator<Integer> iter = s.iterator();
	     for(int i=0; iter.hasNext() ; i++){
	    	 System.out.println("s[i]--"+ s.peek());
	         int comp = s.pop();
	         if(comp == 1){
	        	 list.add(count);
	        	 count = 0;
	         }else{
	        	 count++;
	         }     
	     }
	     
	     arr = new int[list.size()];
	     for(int i=0 ; i< list.size() ; i++){
	    	 arr[i] = list.get(i);
	    	// System.out.println("arr--"+ arr[i] );
	     }
	     
	     Arrays.sort(arr);
	     try{
	    	 MaxLength = arr[arr.length-1];
	     }catch(Exception e){
	    	 MaxLength =0;
	     }
	     
	     return MaxLength;
	    }
}