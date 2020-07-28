package main;
import java.util.*;
//https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
public class FrogJump {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		
		int a = solution(X,Y,Z);
		System.out.println("a------"+ a);
		sc.close();
	}
	
	public static int solution(int X, int Y, int Z) {
		int distance = Y-X;
		return distance%Z == 0 ? distance/Z : distance/Z+1;
	}
}