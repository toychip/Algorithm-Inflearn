package section1_string;

import java.util.Scanner;

public class S09_ExtractionDigit {

    public String solution1(String str) {
        String answer = "YES";
        char temp;

        String excludeStr = str.replaceAll("[A-Za-z]", "");

        char[] excludeChar = excludeStr.toCharArray();

        for(int i = 1; i < excludeChar.length; i++){
            for(int j = 0; j <= i; j++){
                if(excludeChar[j] == '0'){
                    temp = excludeChar[j];
                    excludeChar[j] = excludeChar[i];
                    excludeChar[i] = temp;
                }
            }
        }

        answer = new String(excludeChar);

        return answer;
    }

    public static void main(String[] args){
        S09_ExtractionDigit S9 = new S09_ExtractionDigit();
        Scanner kb = new Scanner(System.in);

        String next = kb.nextLine();
        System.out.println(S9.solution1(next));
    }
}
