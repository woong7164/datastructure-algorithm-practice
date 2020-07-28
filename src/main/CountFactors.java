package main;
import java.util.*;
//https://app.codility.com/demo/results/training4GGNUD-6CT/
public class getDivisions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = solution(n);
		System.out.println("a------"+ a);
		sc.close();
	}
	
	public static int solution(int number) {
		int count = 0;
		int sqrt = (int)Math.sqrt(number);
		for (int i = 1; i <=sqrt; i++){ 
			if(number % i == 0){ 
				count++;
			} 
		} 
		count=count*2;
		
		if(sqrt*sqrt == number){
			count--;
		}
		
		return count;
	}
}