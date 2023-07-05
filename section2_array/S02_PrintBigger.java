package section2_array;

import java.util.Scanner;

public class S02_PrintBigger {

    public String solution(int[] intArr) {
        String answer = "";
        int count = 1;
        int max = intArr[0];

        for (int i = 1; i < intArr.length; i++) {

                if(intArr[i] > max){
                    count ++;
                    max = intArr[i];
            }
        }

        answer += count;

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        S02_PrintBigger S02 = new S02_PrintBigger();

        int size = kb.nextInt();
        int intArr[] = new int[size];

        for (int i = 0; i < size; i++) {
            intArr[i]=kb.nextInt();
        }

        String answer = S02.solution(intArr);

        System.out.println(answer);

    }
}
