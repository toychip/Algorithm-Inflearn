package section1_string;

import java.util.Scanner;

public class S12_Security {

    public String solution1(String input) {
        String answer = "";
        input = input.replaceAll("#", "1");
        input = input.replaceAll("\\*", "0");

        String[] strings = new String[input.length() / 7];
        char[] answerChar = new char[input.length() / 7];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = input.substring(i * 7, i * 7 + 7);

            int toBinary = Integer.parseInt(strings[i], 2);
            answerChar[i] = (char) toBinary;
        }
        answer = String.valueOf(answerChar);

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int c = Integer.parseInt(kb.nextLine());
        String input = kb.nextLine();

        S12_Security S12 = new S12_Security();
        String answer = S12.solution1(input);
        System.out.println(answer);
    }
}
