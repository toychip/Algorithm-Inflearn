package section2_array;

import java.util.Scanner;

public class S01_PrintBigger {

    public String solution(int[] intArr) {
        String answer = "";
        answer += intArr[0] + " ";

        for (int i = 1; i < intArr.length; i++) {
            if(intArr[i] > intArr[i-1]){
                answer += intArr[i] + " ";
            }
        }
        answer = answer.substring(0, answer.length() - 1);

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        S01_PrintBigger S01 = new S01_PrintBigger();

        int size = kb.nextInt();
        int intArr[] = new int[size];

        for (int i = 0; i < size; i++) {
            intArr[i]=kb.nextInt();
        }

        String answer = S01.solution(intArr);

        System.out.println(answer);

    }
}
