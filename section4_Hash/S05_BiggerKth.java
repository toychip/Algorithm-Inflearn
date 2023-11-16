package section4_Hash;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

class S05_BiggerKth {
    public static void main(String[] args) {
        S05_BiggerKth T = new S05_BiggerKth();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        S05_BiggerKth s05 = T;
        System.out.println(s05.solution(arr, n, k));
    }

    public int solution(int[] arr, int n, int k) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;

        for (int x : Tset) {
            cnt++;
            if (cnt == k) return x;
        }
        return answer;
    }
}