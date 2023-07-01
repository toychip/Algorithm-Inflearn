package section1_string;

import java.util.ArrayList;
import java.util.Scanner;

public class S05_SpecialSortConversion {

    public String solution(String str) {
        String answer = "";

        char[] strChar = str.toCharArray();
        // 배열의 제일 왼쪽을 lt, 제일 오른쪽을 rt로 둠
        int lt = 0;
        int rt = strChar.length - 1;
        char temp;

        while(lt < rt){
            if((Character.isLetter(strChar[lt])) && (Character.isLetter(strChar[rt]))){
                temp = strChar[lt];
                strChar[lt] = strChar[rt];
                strChar[rt] = temp;
            }
            lt++;
            rt--;
        }

        answer = new String(strChar);
        return answer;
    }

    public static void main(String[] args){
        S05_SpecialSortConversion S5 = new S05_SpecialSortConversion();
        Scanner kb = new Scanner(System.in);

        String next = kb.next();

        String solution = S5.solution(next);
        System.out.println("solution = " + solution);
    }
}
