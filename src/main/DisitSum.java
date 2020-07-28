/*
 * 프로그래머스 level 1
 * 자릿수 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 */
package main;

import java.util.Scanner;

public class DisitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int answer = 0;
        int answer2 = 0;

        answer = getDisitSum(n);
        System.out.println(answer);
        
        answer2 = getDisitSum2(n);
        System.out.println(answer2);
	}
    
	//재귀함수
    public static int getDisitSum(int n){
        if(n/10==0){
            return n;
        }else{
            return getDisitSum(n/10) + n%10;
        }
    }

    //반복문
    public static int getDisitSum2(int n){
    	int answer = 0; 
    	while(true){
    		answer+=n%10;
    		if(n/10==0){
    			break;
    		}
    		n = n/10;
    	}
    	return answer;
    }
}