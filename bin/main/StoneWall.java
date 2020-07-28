package main;
import java.util.*;

//https://app.codility.com/demo/results/trainingXJQGM5-NS7/?showingAll=1
public class StoneWall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N; i++){
			arr[i]= sc.nextInt();
		}
		int a = solution(arr);
		
		System.out.println("a------"+ a);
		sc.close();
	}
	
	public static int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int h : H) {
            while(!stack.isEmpty() && stack.peek() > h) {
                stack.pop();
            }
            if (!stack.isEmpty() && stack.peek() == h) continue;
            if (stack.isEmpty() || stack.peek() < h) {
                stack.push(h);
                result++;
            }
        }
        return result;
    }
}