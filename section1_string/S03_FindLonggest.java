package section1_string;

import java.util.Scanner;

public class S03_FindLonggest {

    // split 형식
    public String solution1(String str){
        String answer = "";
        int currentLength = 0;
        int maxLength = 0;
        String[] word = str.split(" ");
        for(String x : word){
            currentLength = x.length();
            if(currentLength > maxLength){
                maxLength = currentLength;
                answer = x;
            }
        }
        return answer;
    }

    // indexOf + substring 방식
    public String solution2(String str) {
        String answer = "";
        int currentLength = 0;
        int maxLength = 0;
        int pos;    // 인덱스의 위치를 return

        while((pos=str.indexOf(" ")) != -1){    // 마지막 단어 추가되지 않음
            String subStr = str.substring(0, pos);
            currentLength = subStr.length();

            if(currentLength > maxLength) {
                maxLength = currentLength;
                answer = subStr;
            }
            str = str.substring(pos + 1);
        }
        if(str.length() > maxLength){
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args){
        S03_FindLonggest S3 = new S03_FindLonggest();
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.println(S3.solution1(str));
        System.out.println(S3.solution2(str));
    }
}
