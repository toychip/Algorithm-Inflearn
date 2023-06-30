package section1_string;

import java.util.Scanner;

public class S02_Conversion {

    public String solution(String str){
        String answer ="";

        for (char x : str.toCharArray()){
            if (Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }

            if (Character.isUpperCase(x)){
                answer += Character.toLowerCase(x);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        S02_Conversion S2 = new S02_Conversion();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.print(S2.solution(str));
    }
}
