package section1_string;

import java.util.Scanner;

public class S11_CompactString {

    public String solution(String next) {
        String answer = "";
        int count = 1;
        char prevChar = next.charAt(0);
        for (int i = 1; i < next.length(); i++) {
            char currentChar = next.charAt(i);
            if (currentChar == prevChar) {
                count++;
            }else{
                answer += String.valueOf(prevChar);
                if (count > 1) {
                    answer += String.valueOf(count);
                }
                prevChar = currentChar;
                count = 1;
            }
        }
        answer += String.valueOf(prevChar);
        if (count > 1) {
            answer += String.valueOf(count);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String next = kb.next();

        S11_CompactString S11 = new S11_CompactString();
        String solution = S11.solution(next);
        System.out.println(solution);
    }
}
