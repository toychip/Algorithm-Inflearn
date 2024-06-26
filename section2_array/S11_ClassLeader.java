package section2_array;

import java.util.*;

class S11_ClassLeader {
    public int solution(int n, int[][] arr){

        int answer = 0, max = 0;
        for(int i=1; i<=n; i++){

            int cnt=0;
            for(int j=1; j<=n; j++){

                for(int k=1; k<=5; k++){

                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }

                }

            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        S11_ClassLeader S11 = new S11_ClassLeader();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n+1][6];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(S11.solution(n, arr));
    }
}