//https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/

package main;
import java.util.*;

public class StackNesting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		String N = sc.next();
		
		int a = solution(N);
		System.out.println("a"+ a);
		sc.close();
	}
	
	 public static int solution(String S) {
        Stack<Character> stack = new Stack<>();

        if (S == null) return 1;
        char[] strArr = S.toCharArray();
        System.out.println("a--"+ Arrays.toString(strArr));
        Arrays.toString(strArr);
        if (strArr.length == 1) return 1;


        for(char letter : strArr) {
            if (letter == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) return 0;
                if (!stack.peek().equals('(')) return 0;
                stack.pop();
            }
        }
        return stack.isEmpty() ? 1 : 0;		
    }
	 
	 public static int solution2(String S) {
		  Stack<Character> stack = new Stack<>();
		  char lastChar;
		  for (char c : S.toCharArray()) {
		    if (c == '(' || c == '[' || c == '{') stack.push(c);
		    else {
		      if (stack.empty()) return 0;
		      lastChar = stack.pop();

		      if (c == ')' && lastChar != '(') return 0;
		      else if (c == ']' && lastChar != '[') return 0;
		      else if (c == '}' && lastChar != '{') return 0;
		    }
		  }
		  return stack.isEmpty() ? 1 : 0;
	}

	 public static int solution3(String S) {
		 int answer = 0;
		 for (char x : S.toCharArray()) {
		        if (x == '(')  answer += 1;
		        else answer -= 1;
		            
		        if (answer < 0) return 0;
		 }
		 if (answer != 0) return 0;
		 return 1;
	 }
}