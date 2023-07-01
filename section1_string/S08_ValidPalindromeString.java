package section1_string;

import java.util.Scanner;

public class S08_ValidPalindromeString {

    public String solution1(String str) {
        String answer = "YES";

        String upperStr = str.toUpperCase().replaceAll("[^A-Z]", "");
//        System.out.println("upperStr = " + upperStr);

        String validStr = new StringBuilder(upperStr).reverse().toString();
//        System.out.println("validStr = " + validStr);
//
        if(!validStr.equals(upperStr)){
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args){
        S08_ValidPalindromeString S8 = new S08_ValidPalindromeString();
        Scanner kb = new Scanner(System.in);

        String next = kb.nextLine();
        System.out.println(S8.solution1(next));
    }
}
