//https://app.codility.com/demo/results/training7NUWFS-YEJ/
//슬라이스 최대 합 구하기
//0부터 배열의 끝까지 계속 누적한 값과, 현재의 배열값을 비교

 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        if(A==null)return 0;
        if(A.length==1) return A[0];
        
        int sum =0;
        int maxSum =Integer.MIN_VALUE;
        
        for(int num : A){
            //System.out.println("num: "+ num +" sum: "+ sum + " num+sum: " + (num+sum));
            sum = Math.max(num,num+sum);
            maxSum =  Math.max(sum, maxSum);
            //System.out.println("sum: "+ sum +" maxSum: "+ maxSum);
            //System.out.println("maxSum2-----"+ maxSum);
        }
        
        return maxSum;
    }
}
