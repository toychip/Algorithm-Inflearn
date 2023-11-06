package section4_Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class S03_Sales {
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i = 0; i < k-1; i++){
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        }
        int lt = 0;
        for(int rt=k-1; rt<n; rt++){
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt])-1);
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args){
        S03_Sales s03 = new S03_Sales();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for (int x : s03.solution(n, k, arr)) {
            System.out.print(x + " ");
        }

    }
}