package section5_stackAndQueue.s08;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class S08_EmergencyRoom {
    public static void main(String[] args) throws IOException {
        S08_EmergencyRoom T = new S08_EmergencyRoom();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<S08_Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new S08_Person(i, arr[i]));
        }
        while (!Q.isEmpty()) {
            S08_Person tmp = Q.poll();
            for (S08_Person x : Q) {
                if (x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) return answer;
            }
        }
        return answer;
    }
}