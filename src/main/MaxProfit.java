//https://app.codility.com/demo/results/trainingU7CPYD-DD4
//최솟값과 현재 배열과의 차액의 max값 

package main.Codility_9_MaximumSliceProblem;


class MaxProfit {
    public int solution(int[] A) {
        if (A.length == 0 || A.length == 1) return 0;

        int nMax = Integer.MIN_VALUE;
        int nMin = Integer.MAX_VALUE;

        for (int n : A) {
            nMin = Math.min(nMin, n);
            nMax = Math.max(nMax, n - nMin);
        }

        return nMax;
    }
}
