package section1_string;

import java.util.Scanner;

public class S06_Deduplication {

    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) +" "+ i + " "+ str.indexOf(str.charAt(i)));
            if (i == str.indexOf(str.charAt(i))) {
                answer += str.charAt(i);
            }
        }
//        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args){
        S06_Deduplication S5 = new S06_Deduplication();
        Scanner kb = new Scanner(System.in);

        String input = kb.next();

        System.out.println("solution" + S5.solution(input));
    }

}
