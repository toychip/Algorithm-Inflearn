package section2_array;

import java.util.Scanner;

public class S09_MaxSum {

    public int solution(int n, int[][] arr){
        int answer=-2147000000;
        int sum1=0, sum2=0;
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);
        return answer;
    }

    public static void main(String[] args) {
        S09_MaxSum S09 = new S09_MaxSum();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(S09.solution(n, arr));
    }
}
