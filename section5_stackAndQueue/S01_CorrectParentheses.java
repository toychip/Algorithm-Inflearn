package section5_stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class S01_CorrectParentheses {

    public static void main(String[] args) {
        S01_CorrectParentheses s01 = new S01_CorrectParentheses();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s01.solution(str));
    }

    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }
}