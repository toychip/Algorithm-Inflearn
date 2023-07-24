package section2_array;

import java.util.*;
class S08_GetRank {
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt=1;
            for(int j=0; j<arr.length; j++){
                if(arr[j]>arr[i]) cnt++;
            }
            answer[i]=cnt;
        }
        return answer;
    }
    public static void main(String[] args){
        S08_GetRank S08 = new S08_GetRank();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x :S08.solution(n, arr)) {
            System.out.print(x+" ");
        }
    }
}