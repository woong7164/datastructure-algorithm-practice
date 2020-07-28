//프로그래머스
package main;

import java.util.Stack;
import java.util.Scanner;

public class StockPriceForloop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] prices = new int[5];
		int[] result = new int[5];
		for (int i = 0; i < prices.length; i++) {
			prices[i] = sc.nextInt();
		}

//		Stack<Integer> s = new Stack<>();
//		
//		for(int p : prices){
//			s.push(p);
//		}
		
		for(int i=0; i<prices.length;i++ ){
			System.out.println("i " + i);
			for(int j=i+1; j<prices.length;j++){
				System.out.println("  j "+ j);
				if(prices[i] <= prices[j]){
					result[i] = result[i] +  1;
					//System.out.println("result " + result[i]);
				}else{
					break;
				}
			}
		}
//    
		for(int r : result){
			System.out.print(r);
		}
	    //System.out.println(result[1]);
	    sc.close();
	}
}


