package main;
import java.util.*;

public class IsPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean a = solution(n);
		System.out.println("a------"+ a);
		sc.close();
	}
	
	public static boolean solution(int number) {
		if(number < 2) { return false; } 
		for (int i = 2; i <= Math.sqrt(number); i++){ 
			if(number % i == 0){ 
				return false; 
			} 
		} 
		return true;
	}
}