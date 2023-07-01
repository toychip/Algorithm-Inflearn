package section1_string;

import java.util.Scanner;

public class S08_ValidPalindromeString {

    public String solution1(String str) {
        String answer = "YES";

        String validStr = str.replaceAll("[^0-9]", "");
        int toInt = Integer.parseInt(validStr);

        answer = String.valueOf(toInt);

        return answer;
    }

    public static void main(String[] args){
        S08_ValidPalindromeString S8 = new S08_ValidPalindromeString();
        Scanner kb = new Scanner(System.in);

        String next = kb.nextLine();
        System.out.println(S8.solution1(next));
    }
}
