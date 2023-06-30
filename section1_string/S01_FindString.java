package section1_string;

import java.util.Scanner;

public class S01_FindString {

    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        // System.out.println(str + " " + t);

        // for(int i=0; i<str.length(); i++){
        // if (str.charAt(i) == t){answer ++;}
        // }

        for(char x : str.toCharArray())     // 문자열을 새로운
            if (x == t){answer ++;}

        // System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args){
        S01_FindString S1 = new S01_FindString();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(S1.solution(str, c));
    }
}
