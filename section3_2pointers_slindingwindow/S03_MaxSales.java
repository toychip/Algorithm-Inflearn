package section3_2pointers_slindingwindow;

import java.util.*;
class S03_MaxSales {
    public int solution(int n, int k, int[] arr){
        int answer, sum=0;
        for(int i=0; i<k; i++) {
            sum+=arr[i];
        }
        answer=sum;
        for(int i=k; i<n; i++){
            sum+=(arr[i]-arr[i-k]);
            answer=Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args){
        S03_MaxSales s03 = new S03_MaxSales();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(s03.solution(n, k, arr));
    }
}