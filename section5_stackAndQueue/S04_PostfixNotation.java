package section5_stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

class S04_PostfixNotation {
    public static void main(String[] args) {
        S04_PostfixNotation s04 = new S04_PostfixNotation();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s04.solution(str));
    }

    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }
}