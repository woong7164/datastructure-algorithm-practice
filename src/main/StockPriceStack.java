//프로그래머스
package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StockPriceStack {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] priorities = new int[n];
		for (int i = 0; i < priorities.length; i++) {
			priorities[i] = sc.nextInt();
		}
		int location = sc.nextInt();
				
		StockPriceStack.solution(priorities, location);
	    sc.close();
	}
	
	public static int solution(int[] priorities, int location) {
        List <Integer> list = new ArrayList<>();
        List <Integer> Rlist = new ArrayList<>();
		Queue <Integer> q = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
			list.add(priorities[i]);
		}
        for (Integer i = 0; i < priorities.length; i++) {
			q.offer(i);
		}
        
        boolean isOffer = false;
        Iterator<Integer> iter = q.iterator();
        
	    for(int i=0; iter.hasNext() ; i++){
	    	int p = q.peek();
	    	for(int j=0;iter.hasNext(); j++){
                if(i!=j && p<iter.next()){
                    q.poll();
			        q.offer(i);
                    list.set(i,0);
                    isOffer=true;
            		System.out.print("q1 "+ q + "\n");
                    break;
                }else{
                    isOffer=false;
                }
            }
            if(!isOffer){
                Rlist.add(q.poll());
                System.out.print("q2 "+ q + "\n");
                list.set(i,0);
            }
        
	    }

        while(!q.isEmpty()){
            Rlist.add(q.poll());
        }
        
        return Rlist.indexOf(location)+1;
    }
}




