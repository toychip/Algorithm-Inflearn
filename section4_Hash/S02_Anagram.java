package section4_Hash;

import java.util.*;
class S02_Anagram {
    public String solution(String s1, String s2){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x, map.get(x)-1);
        }

        return answer;
    }

    public static void main(String[] args){
        S02_Anagram s02 = new S02_Anagram();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        String solution = s02.solution(a, b);
        System.out.print(solution);
    }
}