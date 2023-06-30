package section1_string;

import java.util.ArrayList;
import java.util.Scanner;

public class S04_SortConversion {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            /* StringBuilder 사용 법
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
             */

            // 하나씩 전부 바꾸는 방식
            char[] strChar = x.toCharArray();
            // 배열의 제일 왼쪽을 lt, 제일 오른쪽을 rt로 둠
            int lt = 0;
            int rt = strChar.length - 1;
            char temp;

            while(lt < rt){
                temp = strChar[lt];
                strChar[lt] = strChar[rt];
                strChar[rt] = temp;
                lt++;
                rt--;
            }
            answer.add(new String(strChar));
        }

        return answer;

    }

    public static void main(String[] args){
        S04_SortConversion S4 = new S04_SortConversion();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        String[] strings = new String[n];
        for (int i=0; i<n; i++){
            strings[i] = kb.next();
        }

        for(String x : S4.solution(n, strings)){
            System.out.println(x);
        }
    }
}
