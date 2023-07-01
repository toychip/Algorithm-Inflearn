package section1_string;

import java.util.Scanner;

public class S07_PalindromeString {

    public String solution1(String str) {
        String answer = "YES";
        String testStr = str.toUpperCase();

        for(int i=0; i < str.length(); i++){
            if(testStr.charAt(i) != testStr.charAt(str.length() - i - 1)){
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    // String Builder 사용
    public String solution2(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        String temp = new StringBuilder(str).reverse().toString();

        if(!temp.equals(str)){
            answer = "no";
        }
        return answer;
    }


    public static void main(String[] args){
        S07_PalindromeString S7 = new S07_PalindromeString();
        Scanner kb = new Scanner(System.in);

        String next = kb.next();
//        System.out.println(S7.solution1(next));
        System.out.println(S7.solution2(next));
    }
}
