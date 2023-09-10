package section3_2pointers_slindingwindow;

import java.util.*;
class S05_SuccessiveNationalNumSum {
    public int solution(int n){
        int answer=0, cnt=1;
        n--;
        while(n>0){
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        S05_SuccessiveNationalNumSum s05 = new S05_SuccessiveNationalNumSum();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(s05.solution(n));
    }
}