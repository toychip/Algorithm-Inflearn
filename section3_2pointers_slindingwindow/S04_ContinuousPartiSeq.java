package section3_2pointers_slindingwindow;

import java.util.*;
class S04_ContinuousPartiSeq {
    public int solution(int n, int m, int[] arr){
        int answer=0, sum=0, lt=0;
        for(int rt=0; rt<n; rt++){
            sum+=arr[rt];
            if(sum==m) answer++;
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        S04_ContinuousPartiSeq s04 = new S04_ContinuousPartiSeq();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(s04.solution(n, m, arr));
    }
}