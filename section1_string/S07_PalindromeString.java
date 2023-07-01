package section1_string;

import java.util.Scanner;

public class S07_PalindromeString {

    public String solution(String str) {
        String answer = "YES";
        String testStr = str.toUpperCase();

        for(int i=0; i < str.length(); i++){
            if(testStr.charAt(i) != testStr.charAt(str.length() - i - 1)){
                answer = "NO";
                break;
            }
        }

        // System.out.println(" str.length()= " + str.length());
        // System.out.println("count = " + count);


        return answer;
    }

    public static void main(String[] args){
        S07_PalindromeString S7 = new S07_PalindromeString();
        Scanner kb = new Scanner(System.in);

        String next = kb.next();
        System.out.println(S7.solution(next));
    }
}
