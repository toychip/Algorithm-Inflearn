package section2_array;

import java.util.Scanner;

public class S03_RockPaperScissor {

    public String solution(int n, int[] a, int[] b){
        String answer="";
        for(int i=0; i<n; i++){
            if(a[i]==b[i]) answer+="D";
            else if(a[i]==1 && b[i]==3) {
                answer+="A";
            }
            else if(a[i]==2 && b[i]==1) {
                answer+="A";
            }
            else if(a[i]==3 && b[i]==2) {
                answer+="A";
            }
            else {
                answer+="B";
            }
        }
        return answer;
    }

    public static void main(String[] args){
        S03_RockPaperScissor S3 = new S03_RockPaperScissor();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i]=kb.nextInt();
        }
        for(char x : S3.solution(n, a, b).toCharArray()) {
            System.out.println(x);
        }
    }
}
