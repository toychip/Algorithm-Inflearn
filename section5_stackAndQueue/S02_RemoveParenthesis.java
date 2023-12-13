package section5_stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

class S02_RemoveParenthesis {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ;
            } else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++){
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        S02_RemoveParenthesis s02 = new S02_RemoveParenthesis();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s02.solution(str));
    }
}