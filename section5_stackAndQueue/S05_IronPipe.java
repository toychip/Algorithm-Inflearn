package section5_stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

class S05_IronPipe {

    public static void main(String[] args) {
        S05_IronPipe s05 = new S05_IronPipe();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s05.solution(str));
    }

    public int solution(String str) {
        int cnt = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if (str.charAt(i - 1) == '(') cnt += stack.size();
                else cnt++;
            }
        }
        return cnt;
    }
}