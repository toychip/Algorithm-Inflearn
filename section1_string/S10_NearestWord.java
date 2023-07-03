package section1_string;

import java.util.*;

public class S10_NearestWord {


    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];

        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else{
                p++;
                answer[i] = p;
            }
        }
        p=1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                p = 0;
//                answer[i] = p;    이미 위에서 0을 집어 넣었음
            } else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }
//
//  첫 배열에 제대로 못 넣는 문제 해결x
    public List<Integer> mySolution(String next, char c) {
        String temp = next.replaceAll(String.valueOf(c), "0");
        List<Integer> leftAnswerList = new ArrayList<>();
        List<Integer> rightAnswerList = new ArrayList<>();
        List<Integer> finalAnswerList = new ArrayList<>();
        char targetChar = '0';
        int xxx = 1000;
        for (int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) == targetChar){
                xxx = 0;
                leftAnswerList.add(xxx);
            }else{
                leftAnswerList.add(xxx + 1);
                xxx++;
            }
        }
//        for (int q : leftAnswerList) {
//            System.out.print("||q = " + q);
//        }
//        System.out.println();
        int yyy = 1000;
        for (int j = temp.length() - 1; j >= 0; j--) {
            if(temp.charAt(j) == targetChar){
                yyy = 0;
                rightAnswerList.add(yyy);
            }else{
                rightAnswerList.add(yyy + 1);
                yyy++;
            }
        }
        Collections.reverse(rightAnswerList);
//        for (int l : rightAnswerList) {
//            System.out.print("||l = " + l);
//        }
//        System.out.println();
        for (int k = 0; k < temp.length(); k++) {
            if(rightAnswerList.get(k) > leftAnswerList.get(k)){
                Integer station = leftAnswerList.get(k);
                finalAnswerList.add(station);
            }
            else {
                Integer station = rightAnswerList.get(k);
                finalAnswerList.add(station);
            }
        }
//        for (int pp : finalAnswerList) {
//            System.out.print("||p = " + pp);
//        }
//        System.out.println();
        return finalAnswerList;
    }

    public static void main(String[] args){
        S10_NearestWord S10 = new S10_NearestWord();
        Scanner kb = new Scanner(System.in);

        String next = kb.next();
        char c = kb.next().charAt(0);

//        List<Integer> answer = S10.mySolution(next, c);
//        for (int x : answer) {
//            System.out.print(x + " ");
//        }
        int[] solution = S10.solution(next, c);
        for (int x : solution) {
            System.out.println("x = " + x);
        }
    }
}
