package section2_array;

import java.util.Scanner;

public class S07_AdditionalPoints {

    public int solution(int size, int[] array) {
        int answer = 0;
        int cnt=0;
        for(int i=0; i<size; i++){
            if(array[i]==1){
                cnt++;
                answer += cnt;
            }
            else cnt=0;
        }
        return answer;
    }

    public static void main(String[] args) {
        S07_AdditionalPoints S07 = new S07_AdditionalPoints();
        Scanner kb = new Scanner(System.in);

        int size = kb.nextInt();
        int[] questions = new int[size];
        for (int num : questions) {
            int temp = kb.nextInt();
            questions[num] = temp;
        }

        int solution = S07.solution(size, questions);
        System.out.println(solution);
    }
}
