package main.Codility_3_TimeComplexity;
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class TapeEquilibrium {
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
        int leftsum = 0;
        int rightsum = 0;
        
        ArrayList<Integer> leftList = new ArrayList<>(); 
        ArrayList<Integer> righttList = new ArrayList<>(); 
        
        
        //오른쪽부터 합을 리스트에 담고
        //주의:마지막값은 합하지 않기
        for(int i=0;i<A.length-1;i++){
            leftsum+=A[i];
            leftList.add(leftsum);
        }
        
        //왼쪽부터의 합 리스트에 담고
        //주의:마지막값은 합하지 않기
        for(int i=A.length-1;i>=1;i--){
            rightsum+=A[i];
            righttList.add(rightsum);
        }
        //3 1 2 4 3
        //[3, 4, 6, 10]
        //[3, 7, 9, 10]
        //두배열의 반대값끼리 빼기(예:첫번째배열 첫번째값이랑 두번쨰배열 마지막값이랑 빼고, 
        //번쨰 배열 두번쨰값이랑 두번째배열 뒤에서 두번쨰값이랑 뺴고...)
        //abs(3-10), abs(4-9) abs(6-7) abs(10-3)
        //중의 min 값 리턴
        
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<righttList.size();i++){
            int size = righttList.size();
            int minus = Math.abs(leftList.get(i)-righttList.get(size-i-1));
            minSum = Math.min(minus,minSum);
        }
       
        return minSum;
    }
    
    
    //https://app.codility.com/demo/results/training4EY539-QRW/
    //타임 초과
    public static int solution2(int[] A) {
        int[] leftArr;
        int[] rightArr;

        int minus = 0;
        int minNum = Integer.MAX_VALUE;
        for(int i=1; i<A.length;i++){
            int leftsum = 0;
            int rightsum = 0;
            
            leftArr = Arrays.copyOfRange(A, 0, i);
            //System.out.println("leftArr--"+ Arrays.toString(leftArr));
            
            for(int l : leftArr){
                leftsum+=l;
            }
            
            rightArr = Arrays.copyOfRange(A, i, A.length);
            //System.out.println("rightArr--"+ Arrays.toString(rightArr));
            
            for(int r : rightArr){
                rightsum+=r;
                
            }
            minus = Math.abs(leftsum-rightsum);
            minNum = Math.min(minus,minNum); 
           //  System.out.println("minNum--"+ minNum);
        }
        
       
        return minNum;
    }
    
    //다른사람 풀이
    //https://app.codility.com/demo/results/trainingBG9456-ZBM/?showingAll=1
    public static int solution3(int[] A) {
        int front = 0; int back = 0;
        int result = Integer.MAX_VALUE;

        for (int N : A) {
            back += N;
        }

        int count = 0;

        for (int N : A) {
            count++;
            if (count == A.length) break;

            front += N;
            back -= N;

            int temp = Math.abs(front-back);

            result = (result > temp) ? temp : result;
        }

        return result;
    }
}
