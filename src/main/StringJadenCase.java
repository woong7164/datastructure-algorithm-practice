package main;

import java.util.Scanner;

public class StringJadenCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String s = sc.nextLine();
		String answer = solution(s);
		System.out.print(" answer "+answer);
		sc.close();
	}
	
    public static String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");        
        
        for(int i=0;i<sp.length;i++){
            if(i==0 || (i!=0 && " ".equals(sp[i-1]))){
                answer += sp[i].toUpperCase();
            }else{
                answer += sp[i];
            } 
        }
        
        return answer;
    }
}
