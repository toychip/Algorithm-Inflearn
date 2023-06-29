package section1_string;

import java.util.Scanner;

public class S1_01_FindChar {

    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        // System.out.println(str + " " + t);

        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == t){
                answer ++;
            }
        }

        // System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args){
        S1_01_FindChar S1 = new S1_01_FindChar();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(S1.solution(str, c));
    }
}
