package section4_Hash;

import java.util.*;
class S01_ClassPresident {
    public char solution(int n, String s){
        char answer=' ';
        HashMap<Character, Integer> map=new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        //System.out.println(map.containsKey('F'));
        //System.out.println(map.size());
        //System.out.println(map.remove('C'));

        int max=Integer.MIN_VALUE;
        for(char key : map.keySet()){
            //System.out.println(key+" "+map.get(key));
            if(map.get(key)>max){
                max=map.get(key);
                answer=key;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        S01_ClassPresident s01 = new S01_ClassPresident();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        System.out.println(s01.solution(n, str));
    }
}